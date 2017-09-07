package com.asiainfo.chapter1.hanjunwen.webDemo.blog.util;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

public class FileUtil {
    public FileUtil() {

    }

    protected void upload(HttpServletRequest request){
        Boolean result = false;
        String title = null;
        String article = null;
        String url = null;
        //检查请求是否合法：
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (!isMultipart) {
            return;
        }
        try {
            //创建FileItemFactory
            //FileItemFactory:对表单中每一个表单控件做封装
            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setSizeThreshold(1024 * 10 * 50);//设置缓存大小为50KB
//            factory.setRepository(new File("c:/temp"));//设置临时文件目录
            //创建文件上传处理器
            ServletFileUpload upload = new ServletFileUpload(factory);
            //解析请求
            List<FileItem> items = upload.parseRequest(request);
            for (FileItem item : items) {
                //获取表单的name元素值
                String fieldName = item.getFieldName();
                if (item.isFormField()) {
                    if (fieldName.equals("title")) {
                        title = item.getString("utf-8");
//                        System.out.println(title);
                    } else if (fieldName.equals("article")) {
                        article = item.getString("utf-8");
//                        System.out.println(article);
                    }
                    //普通表单控件，获取参数值
//                    System.out.println(item.getString());
//                    title= item.getString("title");
//                    System.out.println(title);
//                    article=item.getString("article");
//                    System.out.println(article);
                } else {
                    //文件上传控件，上传文件的名称
                    String fileName = FilenameUtils.getName(item.getName());//文件的原始名称,FilenameUtils.getName解决IE问题
                    String contentType = item.getContentType();//获取文件的类型
                    long sizeInBytes = item.getSize();//获取文件的大小
                    String dir = request.getSession().getServletContext().getRealPath("/image");
                    //使用UUID定义唯一文件名
                    String randomFileName = UUID.randomUUID().toString() + "." + FilenameUtils.getExtension(fileName);
                    //把上传文件的数据写到磁盘文件中
                    File file = new File(dir, randomFileName);
//                    System.out.println(file.getPath());
                    url = file.getPath();
                    item.write(file);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

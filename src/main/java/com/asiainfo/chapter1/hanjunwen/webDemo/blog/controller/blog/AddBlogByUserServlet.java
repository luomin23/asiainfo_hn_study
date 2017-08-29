package com.asiainfo.chapter1.hanjunwen.webDemo.blog.controller.blog;


import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.OperationBlogDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.dao.impl.OperationBlogDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.entity.Blog;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;


public class AddBlogByUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        Boolean result= false;
        String title=null;
        String article=null;
        String url=null;
        //检查请求是否合法：
        boolean isMultipart= ServletFileUpload.isMultipartContent(request);
        if(!isMultipart){
            return;
        }
        try {
            //创建FileItemFactory
            //FileItemFactory:对表单中每一个表单控件做封装
            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setSizeThreshold(1024*10*50);//设置缓存大小为50KB
//            factory.setRepository(new File("c:/temp"));//设置临时文件目录
            //创建文件上传处理器
            ServletFileUpload upload = new ServletFileUpload(factory);
            //解析请求
            List<FileItem> items =upload.parseRequest(request);
            for (FileItem item:items) {
                //获取表单的name元素值
                String fieldName = item.getFieldName();
                if(item.isFormField()){
                    if(fieldName.equals("title")){
                        title=item.getString("utf-8");
//                        System.out.println(title);
                    }else if(fieldName.equals("article")){
                        article=item.getString("utf-8");
//                        System.out.println(article);
                    }
                    //普通表单控件，获取参数值
//                    System.out.println(item.getString());
//                    title= item.getString("title");
//                    System.out.println(title);
//                    article=item.getString("article");
//                    System.out.println(article);
                }else {
                    //文件上传控件，上传文件的名称
                    String fileName = FilenameUtils.getName(item.getName());//文件的原始名称,FilenameUtils.getName解决IE问题
//                    String contentType = item.getContentType();//获取文件的类型
//                    long sizeInBytes = item.getSize();//获取文件的大小
                    String dir = request.getSession().getServletContext().getRealPath("/image");
                    System.out.println(dir);
                    //使用UUID定义唯一文件名
                    String randomFileName= UUID.randomUUID().toString()+"."+ FilenameUtils.getExtension(fileName);
                    //把上传文件的数据写到磁盘文件中
                    File file = new File(dir,randomFileName);
//                    System.out.println(file.getPath());
                    url="/image/"+randomFileName;
                    item.write(file);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        OperationBlogDAO odb =new OperationBlogDAOImpl();
//        String title = request.getParameter("title");
//        String article = request.getParameter("article");
//        System.out.println(title);
//        System.out.println(article);
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setArticle(article);
        blog.setAuthor((String)request.getSession().getAttribute("username"));
        blog.setUrl(url);
        if(odb.addBlog(blog)){
            result=true;
//            System.out.println("=========");
            request.setAttribute("result",result);
            request.setAttribute("blog",blog);
            request.getRequestDispatcher("/toAddBlogByUserResult.do").forward(request,response);
        }else {
//            System.out.println("22222222222");
            request.setAttribute("result",result);
            request.getRequestDispatcher("/toAddBlogByUserResult.do").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

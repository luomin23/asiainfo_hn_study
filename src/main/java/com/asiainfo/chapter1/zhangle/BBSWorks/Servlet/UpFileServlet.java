package com.asiainfo.chapter1.zhangle.BBSWorks.Servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by del on 2017/8/23.
 */
public class UpFileServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //为解析类提供配置信息
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //创建解析类的实例
        ServletFileUpload sfu = new ServletFileUpload(factory);
        //开始解析
        sfu.setFileSizeMax(1024*400);  //解析实例空间大小的设置
        //每个表单域中数据会封装到一个对应的FileItem对象上
        try {
            List<FileItem> items = sfu.parseRequest(request);
            //区分表单域
            for (int i = 0; i < items.size(); i++) {
                FileItem item = items.get(i);
                //isFormField为true，表示这不是文件上传表单域
                if(!item.isFormField()){
                    ServletContext sctx = getServletContext();
                    //获得存放文件的物理路径
                    //upload下的某个文件夹 得到当前在线的用户 找到对应的文件夹
                    String path = sctx.getRealPath("/upload");
                    System.out.println("路径是:"+path);
                    //获得文件路径
                    String fileName = item.getName();
                    System.out.println("上传的文件的路径:"+fileName);
                    //得到文件的扩展名
                    String exn = fileName.substring(fileName.lastIndexOf("."));
                    Date d = new Date();
                    SimpleDateFormat sd = new SimpleDateFormat("mmss");
                    //根据当前日期生成文件名
                    String fname = sd.format(d) + exn;
                    System.out.println("-------"+fname);
                    //该方法在某些平台(操作系统),会返回路径+文件名
                    fileName = fileName.substring(fileName.lastIndexOf("/")+1);
                    File file = new File("D:\\Git\\Git\\GitFiles\\asiainfo_hn_study\\src\\main\\webapp\\chapter1\\zhangle\\BBSWorks\\upload",fname);
                    if(!file.exists()){
                        System.out.println("-------"+file);
                        item.write(file);
                        request.setAttribute("upimg",fname);
                        request.getRequestDispatcher("../chapter1/zhangle/BBSWorks/upload.jsp").forward(request,response);

                        //getServletContext().getRequestDispatcher("/chapter1/zhangle/BBSWorks/upload.jsp").forward(request,response);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);

    }
}

package com.asiainfo.chapter1.zhangle.BBSWorks.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by del on 2017/8/28.
 */
public class DownFileServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String filename = request.getParameter("filename"); // 获取文件名称

        String path = "D:\\Git\\Git\\GitFiles\\asiainfo_hn_study\\src\\main\\webapp\\chapter1\\zhangle\\BBSWorks\\upload\\" + filename;// 获取要下载文件的全路径地址

        response.setContentType(this.getServletContext().getMimeType(filename));// 文件下载设置

        response.addHeader("Content-Disposition", "attachment,filename=" + filename);

        FileInputStream fis = new FileInputStream(path);// 创建文件的输入流

        OutputStream os = response.getOutputStream();// 得到一个文件输出流，可以向浏览器输出数

        int len = 0;// 表示实际每次读取多少个字节

        byte[] buff = new byte[1024];// 创建一个缓冲字节数组

        while ((len = fis.read(buff)) > 0) {

            os.write(buff, 0, len);

        }

        fis.close();// 关闭资源

        os.flush();

        os.close();
        response.sendRedirect("../chapter1/zhangle/BBSWorks/upload.jsp");



    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);

    }

}

package com.asiainfo.chapter1.hanjunwen.webDemo.blog.controller.blog;

import org.apache.commons.io.FilenameUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DownloadImageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url=request.getParameter("url");//获取路径
        String fileName= FilenameUtils.getName(url);//获取文件名
        System.out.println(fileName);
        response.setContentType(getServletContext().getMimeType(fileName));//设置文件MIME类型
        response.setContentType("application/x-msdownload");
        response.setHeader("Content-Disposition", "attachment;filename="+fileName);//设置请求头信息Content-Disposition，告诉浏览器该文件是需要被下载
        //读取目标文件，通过response将目标文件写到客户端
        String fullFileName = getServletContext().getRealPath(url);
//            System.out.println(fullFileName);
        //读取文件
        InputStream in =new FileInputStream(fullFileName);
        OutputStream out = response.getOutputStream();

        //写文件
        int b;
        while((b=in.read())!=-1){
            out.write(b);
        }
        in.close();
        out.close();
        String result="下载成功！！";
        request.setAttribute("result",result);
        request.setAttribute("url",url);
        request.getRequestDispatcher("/toUserIndexWithPage.do?page=1").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

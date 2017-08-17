package com.asiainfo.chapter1.liuhj.August15.Response;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class OutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置浏览器相应头
       // response.setHeader("Content-Type","text/html;charset=utf-8");

        //字节类型的数组需要把字符串转成字节以后才能输出，支持中文，编码过程编成二进制，使用平台默认默认字符集GB2312。
        //如果设置服务器使用码表为utf-8，需要设置浏览器响应头。
        //  response.getOutputStream().write("你好".getBytes("utf-8"));

        //设置此服务器使用gbk码表来发送信息
        //  response.setCharacterEncoding("gbk");
        //设置浏览器
          // response.setContentType("Content-Type","text/html;charset=utf-8");
        //一行解决服务器,浏览器所有乱码
        response.setContentType("text/html;charset=utf-8");

        // 默认会查iso8859-1，浏览器会使用默认的JBK码表来查就会出现乱码
          response.getWriter().write("北京");

    }
}

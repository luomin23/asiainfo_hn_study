package com.asiainfo.chapter1.luhui.luhui14;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 18237161432 on 2017/8/17.
 */
public class DisplayHeader extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//设置响应内容类型
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        String title="HTTP HEADER 请求实例，我是帅哥实例教程";
        String docType;
    }
}

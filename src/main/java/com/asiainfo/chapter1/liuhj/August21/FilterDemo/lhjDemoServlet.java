package com.asiainfo.chapter1.liuhj.August21.FilterDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//演示配置全站乱码过滤器

public class lhjDemoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //输出时出现乱码，用过滤器可解决此问题
        response.getWriter().write("中文");
    }
}

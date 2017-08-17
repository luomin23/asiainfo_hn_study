package com.asiainfo.chapter1.liuhj.August14;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//演示ServletContext
// 在web应用范围内共享数据


public class Demo2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext context = this.getServletContext();
                     //得到的值是Object类型需要类型转换一下
                    String V = (String) context.getAttribute("apple");
                    System.out.println(V);


    }
}

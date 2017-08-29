package com.asiainfo.chapter1.liuhj.August21.AttributeListenDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 演示监听三大作用域中属性变化的监听器

public class ContextAttributeListenerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().setAttribute("addr","yaxin");
         this.getServletContext().setAttribute("addr","zhengqing");
        this.getServletContext().removeAttribute("addr");
    }
}

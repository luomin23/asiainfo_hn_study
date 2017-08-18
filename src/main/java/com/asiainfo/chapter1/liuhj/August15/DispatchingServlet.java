package com.asiainfo.chapter1.liuhj.August15;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
* 功能：
* ServletContext实现请求转发，把接受到的请求转发给DispatchingServlet1来处理，
* 页面的路径显示不变还是http://localhost:8080/DispatchingServlet
*
*
*
* */

public class DispatchingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher  dispatcher= this.getServletContext().getRequestDispatcher("/DispatchingServlet1");//拿到转发器
        dispatcher.forward(request,response);//  利用转发器把请求和相应转发给被转发对象


    }
}

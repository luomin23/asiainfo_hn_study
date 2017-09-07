package com.asiainfo.chapter1.hanjunwen.webDemo.blog.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class PageUtilServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            String url=request.getParameter("url");
            int page=Integer.parseInt(request.getParameter("page"));
            int pageCount=Integer.parseInt(request.getParameter("pageCount"));
            if(page<1){
                page=1;
            }else if(page>pageCount){
                page=pageCount;
            }
            request.setAttribute("page",page);
            request.getRequestDispatcher(url+"?page="+page).forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

package com.asiainfo.chapter1.liuhj.August17.Request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//由于http协议只能一次请求一此响应所以要运用到请求包含功能

public class IncludeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.getWriter().write("from inceudeServlet");
            request.getRequestDispatcher("/TextServlet").include(request,response);


    }
}

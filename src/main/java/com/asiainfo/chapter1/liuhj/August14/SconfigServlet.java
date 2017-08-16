package com.asiainfo.chapter1.liuhj.August14;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SconfigServlet")
public class SconfigServlet extends HttpServlet {
    protected  void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("TEXT/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.println("敏哥好，这个是测试页面；");
        out.close();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }
}

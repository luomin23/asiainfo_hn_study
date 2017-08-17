package com.asiainfo.chapter1.luhui.luhui13;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 18237161432 on 2017/8/10.
 */
public class Servlet2 extends javax.servlet.http.HttpServlet {
    protected void processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException,IOException{
        response.setContentType("text/html;charset=utf-8");
    PrintWriter out=response.getWriter();
    try {
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ServletFirstServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>这是我的第二个文件" + request.getContextPath() + "</h1>");
        out.println("装逼者" + "<br>");
        out.println("</body>");
        out.println("</html>");
    }finally {
        out.close();
    }}
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest(request,response);
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest(request,response);
    }
}

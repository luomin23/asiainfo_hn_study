package com.asiainfo.chapter1.luhui.luhui15;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 18237161432 on 2017/8/18.
 */
public class registerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* response.setContentType("text/html;");*/
        PrintWriter out=response.getWriter();
        String username=new String(request.getParameter("username").getBytes("ISO-8859-1"),"UTF-8");
        out.println(username);
        out.println(request.getParameter("username"));
        out.println(request.getParameter("userpass"));
        out.println(request.getParameter("sex"));
        out.println(request.getParameter("sf"));
        out.close();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}

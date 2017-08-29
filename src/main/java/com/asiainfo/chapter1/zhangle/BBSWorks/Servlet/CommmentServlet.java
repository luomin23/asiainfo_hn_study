package com.asiainfo.chapter1.zhangle.BBSWorks.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by del on 2017/8/24.
 */
public class CommmentServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        //out.print("<script language='javascript'>document.getElementById('pdiv').style='display:' '';</script>");
        request.getRequestDispatcher("../chapter1/zhangle/BBSWorks/IndexSchool.jsp").forward(request,response);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);

    }
}

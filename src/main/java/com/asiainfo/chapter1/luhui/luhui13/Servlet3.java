package com.asiainfo.chapter1.luhui.luhui13;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 18237161432 on 2017/8/15.
 */

public class Servlet3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        String number=request.getParameter("number");
        double n=Double.parseDouble(number);
        out.println(number+"的平方:"+(n*n));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}

package com.asiainfo.chapter1.luhui.luhui13;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 18237161432 on 2017/8/10.
 */
public class Servlet extends javax.servlet.http.HttpServlet {
protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
     response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println(request.getParameter("gr1")+"<br>");
        out.println(request.getParameter("gr2")+"<br>");
        out.println(request.getParameter("gr3")+"<br>");
         out.println("装逼者");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            processRequest(request,response);
        }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      processRequest(request,response);
    }
    }




package com.asiainfo.chapter1.dongwenchao.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 超超 on 2017/8/14 0014.
 */

public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number=request.getParameter("number");
        try{
            double n=Double.parseDouble(number);
            if (n>6000||n<-6000)
                response.sendRedirect("/chapter1/dongwenchao/web/New1.jsp");
            else {
                RequestDispatcher dispatcher=request.getRequestDispatcher("Servlet1");
                dispatcher.forward(request,response);
            }
        }catch (NumberFormatException e){
            response.sendRedirect("/chapter1/dongwenchao/web/New1.jsp");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

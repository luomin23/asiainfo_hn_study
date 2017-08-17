package com.asiainfo.chapter1.luhui.luhui13;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 18237161432 on 2017/8/11.
 */

public class Servlet4 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
       String number=request.getParameter("number");
        try{
            Double n=Double.parseDouble(number);
            if(n>6000||n<-6000){
                response.sendRedirect("D:\\ideaIU\\Git\\lh\\asiainfo_hn_study\\src\\main\\webapp\\chapter1\\luhui\\html1\\yemian.jsp");//重定向到yemian.jsp；
            }
            else{
                RequestDispatcher dispatcher=request.getRequestDispatcher("Servlet3");
                dispatcher.forward(request,response);//转发到另一个Servlet文件
            }
        }
        catch(NumberFormatException e){
            response.sendRedirect("D:\\ideaIU\\Git\\lh\\asiainfo_hn_study\\src\\main\\webapp\\chapter1\\luhui\\html1\\yemian.jsp");//重定向到yemian.jsp
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);

    }
}

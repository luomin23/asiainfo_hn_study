package com.asiainfo.chapter1.wangjz.java.javaday1.ServletDay1;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wjz123456 on 2017/8/11.
 */
@WebServlet(name = "Verify")
public class Verify extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String number=request.getParameter("number");
        try{
            double n=Double.parseDouble(number);
            if (n>6000||n<-6000){
                response.sendRedirect("/chapter1/wangjz/jspDay1/sendForward.jsp");
            }else {
                RequestDispatcher dispatcher=request.getRequestDispatcher("ShowMessage");
                dispatcher.forward(request,response);
            }
        }catch (NumberFormatException e){
            response.sendRedirect("/chapter1/wangjz/jspDay1/sendForward.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}

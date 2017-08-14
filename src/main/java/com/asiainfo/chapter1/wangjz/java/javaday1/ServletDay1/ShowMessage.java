//package com.asiainfo.chapter1.wangjz.java.javaday1.ServletDay1;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
///**
// * Created by wjz123456 on 2017/8/11.
// */
//@WebServlet(name = "ShowMessage")
//public class ShowMessage extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//   response.setContentType("text/html;charset=utf-8");
//        PrintWriter o=response.getWriter();
//        String qn=request.getParameter("number");
//        double n=Double.parseDouble(qn);
//        o.print(n+"的平方"+(n*n));
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//doPost(request,response);
//    }
//}

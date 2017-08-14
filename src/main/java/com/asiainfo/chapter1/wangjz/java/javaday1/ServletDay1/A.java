//package com.asiainfo.chapter1.wangjz.java.javaday1.ServletDay1;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.http.*;
//import javax.servlet.ServletException;
//
///**
// * Created by wjz123456 on 2017/8/10.
// */
//public class A extends HttpServlet {
//    protected  void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
//        response.setContentType("TEXT/html;charset=utf-8");
//        PrintWriter out=response.getWriter();
//        out.println("<html>");
//        out.println("<head>");
//        out.println("</head>");
//        out.println("<head>");
//        out.println("wjzdgdg");
//        out.println("</body>");
//        out.println("</html>");
//        out.close();
//
//    }
//    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
//      processRequest(request,response);
//    }
//
//    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
//processRequest(request,response);
//    }
//}

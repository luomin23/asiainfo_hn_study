package com.asiainfo.chapter1.hanjunwen.webDemo.servletDemo;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

//设置访问路径

public class TestServlet01 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
//重新定义doGet()方法
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");//设置响应内容类型
        PrintWriter out = response.getWriter();//取得响应输出对象
        String name =request.getParameter("name");//取得请求参数，也就是url中传递过来的数据
        out.println("<html>");
        out.println("<head>");
        out.println("<title></title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>hello!"+name+"!</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}

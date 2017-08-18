package com.asiainfo.chapter1.xushuo.Servlet.ServletFilterx;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by root on 2017/8/17.
 * http://localhost:8080/chapter1.xushuo.Servlet.ServletFilterx/DisplayHeaderServlet
 */
public class DisplayHeaderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应内容的类型
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        // response.getWriter直接输出数据（response.print()）,
        //所以（out.print）只能在其后输出。
        String title ="Http Header 请求实例 - xxx";
        String docType =
                "<!DOCTYPE html> \n";
        //文档类型
        out.println(docType +
                "<html>\n" +
                "<head><meta charset=\"utf-8\">\n"+
                "<title>过滤器</title>\n"+
                "</head>\n"+
                "<body>\n" +
                "<h1>aaa</h1>\n" +
                "</html>\n");

        Enumeration headerNames = request.getHeaderNames();
        //获取头名字的一个枚举
        while (headerNames.hasMoreElements()) {
            String paramName = (String)headerNames.nextElement() ;
            out.print("<tr><td>" + paramName + "</td>\n");
            String paramValue = request.getHeader(paramName);
            out.println("<td> " + paramValue + "</td></tr>\n");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

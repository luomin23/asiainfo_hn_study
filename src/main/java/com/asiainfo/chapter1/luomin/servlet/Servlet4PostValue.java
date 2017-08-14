package com.asiainfo.chapter1.luomin.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Luoo on 2017/8/13.
 */
public class Servlet4PostValue extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("gbk");
        String company = getServletConfig().getInitParameter("company");

        String name = request.getParameter("id");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String title = "使用 POST 方法读取表单数据";

        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>站点名</b>："
                + name + "\n" +
                "  <li><b>网址</b>："
                + company + "\n" +
                "</ul>\n" +
                "</body></html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String title = "使用 GET 方法读取表单数据";
        // 处理中文
        String name = request.getParameter("id");
        name = new String(name.getBytes("iso-8859-1"),"utf-8");

        String url = "你好";

        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>站点名</b>："
                + name + "\n" +
                "  <li><b>网址</b>："
                + url + "\n" +
                "</ul>\n" +
                "</body></html>");

    }
}

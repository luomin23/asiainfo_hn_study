package com.asiainfo.chapter1.wangjz.java.javaday1.ServletDay1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by wjz123456 on 2017/8/16.
 */

public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("TEXT/html;charset=utf-8");
//        PrintWriter out=response.getWriter();
//        out.println("wjzdgdg");
//        out.close();
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html;charset=utf-8");
        PrintWriter o=response.getWriter();
        String t="http hrader 请求实例-www";
        String docType =
                "<!DOCTYPE html> \n";
//        o.println(docType +
//                "<html>\n" +
//                "<head><meta charset=\"utf-8\"><title>" + title + "</title></head>\n"+
//                "<body bgcolor=\"#f0f0f0\">\n" +
//                "<h1 align=\"center\">" + title + "</h1>\n" +
//                "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
//                "<tr bgcolor=\"#949494\">\n" +
//                "<th>Header 名称</th><th>Header 值</th>\n"+
//                "</tr>\n");
        Enumeration headerNames=request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String paramName=(String)headerNames.nextElement();
            o.print(paramName);
            String paramValue=request.getHeader(paramName);
            o.print(paramValue);
        }
        o.print("</table>\n</body></html>");
    }
}

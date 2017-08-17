<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/15
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c : cookies) {
            String name = c.getName();
            String value = c.getValue();
            out.print("========================");
            out.println("<h3>Name:" + name + "</h3>");
            out.println("<h3>Value:" + value + " </h3 >");
            out.print("*************************");
        }
    } else {
        out.print("没有Cookie");
    }
%>

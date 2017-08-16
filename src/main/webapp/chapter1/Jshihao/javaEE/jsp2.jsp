<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/8/15
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
</head>
<body>
<%
    out.println("你的IP地址"+request.getRemoteAddr());
%>
<p>今天的日期是：<%=(new java.util.Date()).toLocaleString()%></p>
</body>
</html>

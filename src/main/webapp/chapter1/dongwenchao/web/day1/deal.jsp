<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/16 0016
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>Title</title>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
    String id=request.getParameter("id");	//获取id参数的值
    String name=request.getParameter("name");//获取user参数的值
    name=new String (name.getBytes("ISO-8859-1"),"UTF-8");
    String pa=request.getParameter("pa");//获取pwd参数值
    request.setCharacterEncoding("UTF-8");
%>

<%=id%>
<%=name%>
<%=pa%>
</body>
</html>

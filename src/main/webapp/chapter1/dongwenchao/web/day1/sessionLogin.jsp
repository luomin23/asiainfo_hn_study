<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/16 0016
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>对象应用</title>
</head>
<body>
<%
session.setAttribute("a","客户");
%>
<h3>请先登录</h3>
<form action="shop.jsp" method="post">
    客户名:<input type="text" name="loginName">
    <input type="submit"value="登录">
</form>
</body>
</html>

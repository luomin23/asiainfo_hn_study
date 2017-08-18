<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/18
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>登录界面</title>
</head>
<body>
<%
    session.setAttribute("customer","客户");//为customer变量传值“客户”
%>
<h3>请先登录后购物车：</h3>
<hr>
<form action="shop.jsp" method="get">
    客户名：<input type="text" name="loginName">
    <input type="submit" value="登录">
</form>
</body>
</html>

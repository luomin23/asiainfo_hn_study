<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/16 0016
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String na=request.getParameter("loginName");
    session.setAttribute("name",na);
%>
<h2>要买的商品</h2>
<form action="account.jsp"method="post">
    要买的品：<input type="text"name="goo">
    <input type="submit" value="购物">
</form>
</body>
</html>

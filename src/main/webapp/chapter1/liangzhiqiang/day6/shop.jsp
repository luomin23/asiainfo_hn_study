<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/18
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>购物</title>
</head>
<body>
<%
    String na=request.getParameter("loginName");
    session.setAttribute("name",na);
%>
<h3>请输入你想购买的商品：</h3>
<hr>
<form action="account.jsp"method="get">
    要购买商品：<input type="text" name="goodsName">
    <input type="submit" value="购物">
</form>
</body>
</html>

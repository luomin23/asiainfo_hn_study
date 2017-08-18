<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/18
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>结账</title>
</head>
<body>
<%
    String gn=request.getParameter("goodsName");
    session.setAttribute("goods",gn);
    String 客户=(String)session.getAttribute("customer");
    String 姓名=(String)session.getAttribute("name");
    String 商品=(String)session.getAttribute("goods");
    %>
<h3>结账信息</h3>
<hr>
<%=客户%>的姓名是：<%=姓名%>
<br>
你购买的商品是：<%=商品%>
</body>
</html>

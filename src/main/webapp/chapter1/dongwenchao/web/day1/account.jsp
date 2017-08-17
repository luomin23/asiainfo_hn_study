<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/16 0016
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结账</title>
</head>
<body>
<%
String gn=request.getParameter("goo");
    session.setAttribute("goods",gn);
    String 客户=(String)session.getAttribute("a");
    String 姓名= (String) session.getAttribute("name");
    姓名=new String(姓名.getBytes("ISO-8859-1"),"UTF-8");
    String 商品=(String)session.getAttribute("goo");
%>
<%=客户%>的姓名是:<%=姓名%>
商品是：<%=商品%>
</body>
</html>

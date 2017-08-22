<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2017/8/21
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updateservlet.do" method="post"><%
    String id=request.getParameter("id");
    String name=new String(request.getParameter("name").getBytes("ISO-8859-1"),"utf-8");
    String phone=request.getParameter("phone");
    String address=new String(request.getParameter("address").getBytes("ISO-8859-1"),"utf-8");
    String emil=new String(request.getParameter("emil").getBytes("ISO-8859-1"),"utf-8");
    String age=request.getParameter("age");%>
    id:<input type="text" name="id" value="<%=id%>"><br>
    姓名：<input type="text" name="name" value="<%=name%>"><br>
    手机号：<input type="text" name="phone" value="<%=phone%>"><br>
    地址：<input type="text" name="address" value="<%=address%>"><br>
    邮箱：<input type="text" name="emil" value="<%=emil%>"><br>
    年龄：<input type="text" name="age" value="<%=age%>"><br>
    <input type="submit" value="修改">
</form>
</body>
</html>

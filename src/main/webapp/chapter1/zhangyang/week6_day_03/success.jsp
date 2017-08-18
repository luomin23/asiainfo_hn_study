<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/16
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%String str = (String) request.getSession().getAttribute("username");%>
<h1>登录成功，当前用户：<%=str%></h1>
<h2>登录时间：<%=request.getSession().getAttribute("localDate")%></h2>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/8/16
  Time: 16:03
  To change this template use File | Settings | File Templates.
  用户成功登录后的主页
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的主页</title>
</head>
<body>
        欢迎:<%=request.getSession().getAttribute("username")%>
</body>
</html>

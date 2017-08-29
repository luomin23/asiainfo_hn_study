<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/8/16
  Time: 15:06
  To change this template use File | Settings | File Templates.
  用户的登录页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <style>
        span{color:red;}
    </style>
</head>
<body>

    <form action="/tologin" method="post">
        用户名：<input type="text" name="username" required><br>
        密  码：<input type="password" name="pwd" required><br>
        <input type="submit" name="login" value="登录">
        <input type="reset" value="重置"><br>
        <%String result=(String) request.getAttribute("loginResult");%>
        <%if(result!=null&&!result.equals("")){%>
            <span><%=result%></span>
        <%}%>
    </form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/23
  Time: 15:18


  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8"  %>

<html>
<head>
    <title>用户登陆</title>
</head>

<body>
<form action="${pageContext.request.contextPath }/servlet/LoginServlet" method="post">
    用户名：<input type="text" name="username"><br/>
    密码：<input type="password" name="password"><br/>
    <input type="submit" value="登陆">
</form>
</body>
</html>
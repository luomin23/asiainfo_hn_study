<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2017/8/14
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action ="LoginServletDemo01" method="post">
    useName:<input type="text" name="uname" /> <br/>
    password:<input type="password" name="upwd" /><br/>
    <input type="submit" value="Login"/>
    <input type="reset" value="Reset" />
</form>
</body>
</html>

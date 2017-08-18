<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2017/8/17
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form>
    用户名：<input type="text" name="username"><br>
    密码：<input type="password" name="password" value="${cookie.username.value}"><br>
    <input type="checkbox" name="isSave" value="1">保存7天用户名<br>
    <input type="submit" value="登录">
</form>

</body>
</html>

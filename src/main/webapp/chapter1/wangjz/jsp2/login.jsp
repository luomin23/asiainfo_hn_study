<%--
  Created by IntelliJ IDEA.
  User: wjz123456
  Date: 2017/8/17
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="utf-8">
    <title>Title</title>
</head>
<body>
<font color="red">${message}</font>
<br>
<form action="hello.jsp" method="post">
    name<input name="username" type="text">
    password<input name="password" type="password">
    submit<input type="submit">
</form>

</body>
</html>

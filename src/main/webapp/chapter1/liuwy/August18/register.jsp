<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2017/8/18
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/registservlet.do" method="post">
    姓名：<input type="text" name="name"><br>
    电话：<input type="text" name="phonenumber"><br>
    地址：<input type="text" name="address"><br>
    邮箱：<input type="text" name="emil"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交">

</form>
</body>
</html>

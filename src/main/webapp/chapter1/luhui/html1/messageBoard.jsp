<%--
  Created by IntelliJ IDEA.
  User: 18237161432
  Date: 2017/8/15
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>留言板页面</title>
</head>
<body background="08.jpg">
<form action="../../../ServletAddMeassage" method="post">
    留言者：<input type="text" name="author" size="30">
    <br>
    留言标题：<input type="text" name="title" size="30">
    <br>
    留言内容：<textarea name="content" rows="8" cols="30"></textarea>
    <p>
    <input type="submit" value="提交">
    <input type="reset" value="清除">
    <a href="showMessage.jsp">查看留言</a>

</form>
</body>
</html>

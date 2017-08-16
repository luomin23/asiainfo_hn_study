<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/15 0015
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>留言板页面</title>
</head>
<body>
<form action="../../../AddMessageServlet" method="post">
    留言者：<input type="text"name="aut" size="30">
    <br>
    留言标题:<input type="text"name="title" size="30">
    <br>
    留言内容：<textarea name="content" rows="8"cols="30"></textarea>
    <p>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
    <a href="ShowMessage.jsp">查看留言</a>
</form>
</body>
</html>

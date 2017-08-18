<%--
  Created by IntelliJ IDEA.
  User: wjz123456
  Date: 2017/8/18
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="utf-8">
    <title>留言吧哦信息</title>
</head>
<body>
<form action="../../../AddMessageServlet" method="post">
    留言者：<input type="text" name="author" size="30"><br>
    留言标题：<input type="text" name="title" size="30"><br>
    留言内容:<textarea name="content" rows="8"></textarea><br>
    <p>
        <input type="submit" value="提交">
        <input type="reset" value="重置">
        <a href="showMessage.jsp">查看留言</a>
    </p>
</form>
</body>
</html>

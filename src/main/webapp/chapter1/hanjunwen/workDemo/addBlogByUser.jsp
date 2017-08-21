<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/8/18
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发表博客</title>
</head>
<body>
    <%=request.getSession().getAttribute("username")%>:<br>
    <form action="/addBlogByUser.do" method="post">
    主题:<input type="text" name="title" required><br>
    内容:<textarea name="article" required></textarea><br>
        <input type="submit" value="发表" name="publish"><a href="/toUserIndex.do">返回主页</a>
    </form>
</body>
</html>

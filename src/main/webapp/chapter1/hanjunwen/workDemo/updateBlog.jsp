<%@ page import="com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.Blog" %><%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/8/21
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改博客</title>
</head>
<body>
    <%Blog blog=(Blog) request.getAttribute("blog");
//        String id=String.valueOf(blog.getId());
//        String author=blog.getAuthor();
//        String title=blog.getTitle();
//        String article=blog.getArticle();
    %>
    <%=request.getSession().getAttribute("username")%>:<br>
    <form action="/updateBlogByUser.do" method="post">
        <input type="hidden" name="id" value=<%=blog.getId()%> />
        作者：<input type="text" name="author" value=<%=blog.getAuthor()%> disabled/><br>
        标题：<input type="text" name="title" value=<%=blog.getTitle()%> /><br>
        内容：<textarea name="article" value=<%=blog.getArticle()%>><%=blog.getArticle()%></textarea><br>
        <input type="submit" name="updateBlogByUser" value="修改"><a href="/toUserIndex.do">返回主页</a>
    </form>
</body>
</html>

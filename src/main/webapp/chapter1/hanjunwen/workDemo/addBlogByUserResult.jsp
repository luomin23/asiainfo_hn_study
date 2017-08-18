<%@ page import="com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.Blog" %><%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/8/18
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发表结果页面</title>
</head>
<body>
    <%--<%=request.getAttribute("result")%><br>--%>
    <%=request.getSession().getAttribute("username")%>:<br>
    <%
        Boolean result=(Boolean)request.getAttribute("result");
        Blog blog =(Blog)request.getAttribute("blog");
        if(result){%>
            发表成功！内容如下：<br>
            标题:<%=blog.getTitle()%><br>
            作者:<%=blog.getAuthor()%><br>
            内容:<%=blog.getArticle()%><br>
        <a href="/toUserIndex.do">返回主页</a>
        <%}else {%>
            发表失败！<br>
        <a href="toAddBlogJsp.do">返回重新发表</a><a href="/userIndex.jsp">返回主页</a>
       <% }
    %>

</body>
</html>

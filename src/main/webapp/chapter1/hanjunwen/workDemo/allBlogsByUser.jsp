<%@ page import="java.util.List" %>
<%@ page import="com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.Blog" %><%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/8/18
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>博客</title>
</head>
<body>
    <% List<Blog> blogs=(List<Blog>) request.getAttribute("blogs");%>
    <%String result=(String)request.getAttribute("result");%>
    <%=request.getSession().getAttribute("username")%>:<br>
    <%if(result!=null){
        out.print(result);
    }%>
    <a href="/toUserIndex.do">返回主页</a><br>
    <table border="1">
        <tr>
            <th>序列号</th>
            <th>文章标题</th>
            <th>作者</th>
            <th>内容</th>
            <th>操作</th>
        </tr>
        <%
            for (int i = 0; i <blogs.size() ; i++) {
                Blog blog=blogs.get(i);%>
            <tr>
                <td><%=i+1%></td>
                <td><%=blog.getTitle()%></td>
                <td><%=blog.getAuthor()%></td>
                <td><%=blog.getArticle()%></td>
                <td><a href="/deleteBlogById.do?id=<%=blog.getId()%>">删除</a></td>
            </tr>
        <% }
        %>
    </table>
</body>
</html>

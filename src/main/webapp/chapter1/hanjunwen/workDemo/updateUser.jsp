<%@ page import="com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/8/17
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
</head>
<body>
    <%User u= (User) request.getAttribute("user");%>
    <form action="/updateUser.do" method="post">
        用户名：<input type="text" name="username" value=<%=request.getSession().getAttribute("username")%> disabled><br>
        密码：<input type="password" name="pwd" required><br>
        <input type="submit" name="update" value="修改"><a href="/toUserIndex.do">返回主页</a>
    </form>
</body>
</html>

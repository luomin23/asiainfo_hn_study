<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/16
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <div style="margin-top: 100px">
        <h2>请登录</h2>
            <form action="/UserServlet" method="post">
               用户名： <input type="text" name="username" id="username"/><br>
               密码： <input type="password" name="password" id="password"/><br>
                <input type="submit" value="登录">
            </form>
    </div>
</center>
</body>
</html>

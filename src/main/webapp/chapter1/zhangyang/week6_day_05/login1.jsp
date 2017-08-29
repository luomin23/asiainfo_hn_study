<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/22
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/chapter1/zhangyang/week6_day_05/css/login.css">
</head>
<body>
<form action="/LoginCheckServlet" method="post">
    <div class="content">
        <!-- 登录面板 -->
        <div class="panel">
            <!-- 账号和密码组 -->
            <div class="group"> <label>账号</label> <input type="text" id="username" name="username"required > </div>
            <div class="group"> <label>密码</label> <input type="password" id="password" name="password"required></div>
            <!-- 登录按钮 -->
            <div class="login"> <button>登录</button></div>
        </div>
        <!-- 注册按钮 -->
        <div class="register">
            <button><a href="/chapter1/zhangyang/week6_day_05/register.jsp" style="display:block;text-align:center;text-decoration: none">创建新账号</a></button>
        </div>
    </div>
</form>
</body>
</html>

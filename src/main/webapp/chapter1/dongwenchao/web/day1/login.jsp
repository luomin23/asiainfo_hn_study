<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/16 0016
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="../../../../LoginServlet">
    126邮箱登录<br/><br/>
    用户名：<input type="text" name="username" ><br/>
    密    码：<input type="text" name="password" ><br/>
    <select name="saveTime">
        <option value="366">一年</option>
        <option value="183">半年</option>
        <option value="30">一个月</option>
        <option value="7">一周</option>
    </select><br/>
    <input type="submit" value="登录" />
</form>
</body>
</html>

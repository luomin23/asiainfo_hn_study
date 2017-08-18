<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2017/8/18
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
<form action="/EnrollDemox" method="post">
    用户名：<input type="text" name="userName"><br/>
    密码：<input type="text" name="pwd"><br/>
    性别：<input type="radio" name="sex" value="男" checked="checked">男
    <input type="radio" name="sex" value="女">女<br/>
    爱好：<input type="checkbox" name="hobby" value="足球">足球
    <input type="checkbox" name="hobby" value="篮球">篮球
    <input type="checkbox" name="hobby" value="排球">排球
    <input type="checkbox" name="hobby" value="羽毛球">羽毛球<br/>
    所在城市：<select name="city">
    <option>---请选择---</option>
    <option value="bj">北京</option>
    <option value="sh">上海</option>
    <option value="sy">沈阳</option>
</select>
    <br/>
    <input type="submit" value="点击注册">
</form>
</body>
</html>

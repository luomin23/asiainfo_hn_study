<%--
  Created by IntelliJ IDEA.
  User: 18237161432
  Date: 2017/8/18
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form method="post" action="../../../registerServlet">
   用户名： <input type="text" name="username">
    <br>
   密码:<input type="password" name="userpass">
    <br>
   性别：<input type="radio" name="sex" value="男" checked>男
    <input type="radio" name="sex" value="女">女
    所在省份：<select name="sf" size="1">
    <option value="河南">河南</option>
    <option value="上海">上海</option>
    <option value="浙江">浙江</option>
    <option value="湖北">湖北</option>
    <option value="北京">北京</option>
    <option value="深圳">深圳</option>
</select>
    <input type="submit" value="注册">
    <input type="reset" value="清除">

</form>
</body>
</html>

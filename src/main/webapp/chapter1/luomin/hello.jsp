<%--
  Created by IntelliJ IDEA.
  User: Luoo2
  Date: 2017/8/13
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/hello" method="get" id="helloform">
    <label>ID</label>
    <input name="id" type="text" />
    <input type="checkbox" name="runoob" checked="checked" /> 菜鸟教程
    <input type="button" value="提交" onclick = "helloformSubmit();"  />
</form>
</body>
<script>

    function helloformSubmit() {
        document.getElementById("helloform").submit();
    }
</script>
</html>

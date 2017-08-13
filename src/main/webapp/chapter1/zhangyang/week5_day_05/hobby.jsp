<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/11
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hobby</title>
</head>
<body>
    <form action="/HobbyServlet" method="post">
        <input type="checkbox" name="hobbies" value="valleyball">valleyball<br>
        <input type="checkbox" name="hobbies" value="basketball">basketball<br>
        <input type="checkbox" name="hobbies" value="football">football<br>
        <input type="submit" value="提交">
    </form>
</body>
</html>

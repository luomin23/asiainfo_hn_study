<%--
  Created by IntelliJ IDEA.
  User: wjz123456
  Date: 2017/8/18
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="utf-8">
    <title>el</title>
</head>
<body>
<form>
    username:<input type="text" name="username"
   value="${username}">
    <input type="submit" name="submit"><br>
</form>
username:<%=request.getParameter("username")%>

</body>
</html>

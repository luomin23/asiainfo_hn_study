<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/11
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String username = (String) request.getAttribute("username");
    out.println(username);
%>
,loginSuccess!
</body>
</html>

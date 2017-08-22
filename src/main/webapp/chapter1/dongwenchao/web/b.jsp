<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/18 0018
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="TestServlet1" method="post">
<h4>BBB  page</h4>
城市：<%=request.getAttribute("a")%>
<a href="/chapter1/dongwenchao/web/day1/c.jsp">To c page</a>
</form>
</body>
</html>

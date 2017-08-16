<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/15 0015
  Time: 08:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据处理页面</title>
</head>
<body>
<%
String name=request.getParameter("name");
    String password=request.getParameter("password");
    if (name.equals("QQ")||password.equals("123")){
%>
<jsp:forward page="success.jsp">
    <jsp:param name="user" value="<%=name%>"/>
</jsp:forward>
<%
    }
    else {
%>
<jsp:forward page="login.jsp">
    <jsp:param name="user" value="<%=name%>"/>
</jsp:forward>
<%}%>
</body>
</html>

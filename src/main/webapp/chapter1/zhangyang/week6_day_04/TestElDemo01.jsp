<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/17
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
EL表达式<br>
<%
    String name1 ="tom";
    request.setAttribute("name",name1);
%>
name=<%=name1%><br>
name=${name}
</body>
</html>

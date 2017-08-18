<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/17
  Time: 15:04
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
            pageContext.setAttribute("scope","page");
            request.setAttribute("scope","request");
            session.setAttribute("scope","session");
            application.setAttribute("scope","appliaction");
        %>
            scope=${scope}<br><%--默认取最小的作用域--%>
            scope = ${applicationScope.scope}
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 刘豪杰
  Date: 2017/8/18
  Time: 9:22
  To change this template use File | Settings | File Templates.
  演示作为四大作用域的入口，操作四大作用域属性
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
      pageContext.setAttribute("name","zhang",PageContext.REQUEST_SCOPE);
%>

<%=pageContext.getAttribute("name",PageContext.REQUEST_SCOPE)%>


<%--
  查询作用域中的属性
--%>
<%=pageContext.findAttribute("name")%>
</body>
</html>

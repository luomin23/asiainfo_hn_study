<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/18
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html；charset=UTF-8">
    <title>对象应用</title>
</head>
<body>
<h3>使用pageContext对象获取其他内容内置对象中的值：</h3>
<hr>
<%
    request.setAttribute("name","java程序设计与项目实训（亚信科技）");
    session.setAttribute("name","java程序设计与项目实训（亚信科技）");
    application.setAttribute("name","ava程序设计与项目实训(亚信科技)");
%>
request对象中的值：<%=pageContext.getRequest().getAttribute("name")%>
<br>
session对象中的值：<%=pageContext.getSession().getAttribute("name")%>
<br>
application对象中的值：<%=pageContext.getServletContext().getAttribute("name")%>
</body>
</html>

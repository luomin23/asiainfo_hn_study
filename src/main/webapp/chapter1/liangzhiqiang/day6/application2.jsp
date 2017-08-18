<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/18
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>版本号</title>
</head>
<body>
<br>
jsp引擎名servlet及版本号：<%=application.getServerInfo()%>
<br>
<%
    application.setAttribute("name","java技术实战");
    out.println(application.getAttribute("name")+"<br>");
    application.removeAttribute("name");
    out.println(application.getAttribute("name")+"<br>");
%>

</body>
</html>

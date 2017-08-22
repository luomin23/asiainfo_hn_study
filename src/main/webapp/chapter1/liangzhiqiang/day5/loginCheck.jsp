<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/17
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; pageEncoding=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" >
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
<%
    }
%>
</body>
</html>

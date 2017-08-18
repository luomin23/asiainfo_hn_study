<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/18
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>对象实用实例</title>
</head>
<body>
<hr>
session的创建时间是：<%=session.getCreationTime()%>&nbsp;
<%=new Date(session.getCreationTime())%>
<br>
session的id号：<%=session.getId()%>
<br>
客户最近一次访问时间是：<%=session.getLastAccessedTime()%>&nbsp;
<%=new java.sql.Time (session.getLastAccessedTime())%>
<br>
两次请求间隔多长时间session将被取消(ms);
<%=session.getMaxInactiveInterval()%>
<br>
是否是新创建的session:<%=session.isNew()?"是":"否"%>
<hr>
<%
    session.setAttribute("name","传说中的大神");
    session.setAttribute("password","123456789");
%>
姓名：<%=session.getAttribute("name")%>
<br>
密码：<%=session.getAttribute("password")%>
<br>
ID号:<%=session.getId()%>
<br>
<%
    session.getMaxInactiveInterval();
%>

    最大有效时间：<%=session.getMaxInactiveInterval()%>
<br>
<%
    session.removeAttribute("name");
%>
姓名：<%=session.getAttribute("name")%>
<hr>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/15 0015
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>对象应用实例</title>
</head>
<body>
<%
String a=(String)application.getAttribute("count");
    int count=0;
    if (a!=null)
        count=Integer.parseInt(a) +1 ;
        application.setAttribute("count",String.valueOf(count));
%>
您是第<%=application.getAttribute("count")%>
</body>
</html>

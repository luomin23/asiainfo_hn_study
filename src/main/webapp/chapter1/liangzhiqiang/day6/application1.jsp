<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/18
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>访问计数器</title>
</head>
<body>
<%
    String strNum=(String)application.getAttribute("count");
    int count=10001;
    if (strNum!=null)
        count=Integer.parseInt(strNum)+1;
    application.setAttribute("count",String.valueOf(count));
%>
你是第<%=application.getAttribute("count")%>位访问者!
</body>
</html>

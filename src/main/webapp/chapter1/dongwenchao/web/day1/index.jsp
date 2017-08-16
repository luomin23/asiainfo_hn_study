<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/16 0016
  Time: 08:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>首页</title>
</head>
<body>
<%
    try {
    int a=100;
    int b=0;
    request.setAttribute("c",a/b);
    }catch (Exception e){
        request.setAttribute("c","很抱歉页面产生错误！");
    }
%>
<jsp:forward page="../deal.jsp"></jsp:forward>
</body>
</html>

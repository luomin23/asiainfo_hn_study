<%--
  Created by IntelliJ IDEA.
  User: 18237161432
  Date: 2017/8/10
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP页面的基本结构实例</title>
</head>
<body>


<%!int sum=0;
    int x=1;
    %>
<%
    while(x<=10)
    {
        sum+=x;
        ++x;
    }
%>
<p>1加到10的结果是:<%=sum%></p>
<p>现在时间是：<%=new java.util.Date()%></p>
<%out.print("hello,world");%>
</body>
</html>

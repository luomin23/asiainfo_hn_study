<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/10
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEnconding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type"content="text/html;charset=UTF-8">

    <title>jsp页面的基本结构实例</title>
</head>
<body>
    <%!int sum=0;
    int x=1;
    %>
    <%
    while (x<=10)
    {
    sum+=x;
    ++x;
    }
    %>
<p>1加到10的结果是:<%=sum%></p>
<p>现在的时间是:<%=new java.util.Date()%></p>
      </body>
        </html>
<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/11
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type"content="text/html;charset=UTF-8">
    <title>表达式实例</title>

</head>
<body>
<%!
    String name="清华大学出版社";
    String urlAddress="http://www.tup.tsinghua.edu.cn/index.html";
    String page="www.sohu.com";
%>
<br>
用户名：<%=name%>
<br>
<a href="<%=urlAddress %>">清华大学出版社网站</a>
<br>
<form action="<%=page%>">

</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2017/8/15
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="background-color: ${'#dddddd'}">HelloWorld!!</h1><br><hr>
EL表达式<br>
常量<br>
${10}<br>
${10.1}<br>
${"aba"}<br>
${'abc'}<br>
运算符<br>
${10+20}<br>
${"abc"=="abc"}<br>
empty<br>
${empty null}<br>
${empty ""}<br>
取值
<%=request.getParameter("name")%>
${param.name}<br>

</body>
</html>

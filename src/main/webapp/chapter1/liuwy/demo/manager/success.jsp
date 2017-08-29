<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2017/8/23
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎您！“<%=session.getAttribute("username")%>”<br>
您可以查询员工：<br>
<form action="/selectservlet.do" method="post">
    请输入你要查询的员工id号：<br>
    <input type="text" name="id"><input type="submit" value="查询"></form><br>
<button  onclick="history.back()">返回</button><br><hr>
<form action="/findpageservlet.do" method="post">
 <input type="submit" value="查询所有"></form>

</body>
</html>

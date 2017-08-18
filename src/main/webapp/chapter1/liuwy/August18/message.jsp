<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2017/8/18
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>手机号</td>
        <td>地址</td>
        <td>邮箱</td>
    </tr>
    <tr>
        <%
           // String id=(String)request.getAttribute("id);

        %>
        <td><%=request.getParameter("id")%></td>
        <td><%=request.getAttribute("id")%></td>
        <td><%=request.getAttribute("id")%></td>
        <td><%=request.getAttribute("id")%></td>
        <td><%=request.getAttribute("id")%></td>
        <td><%=request.getAttribute("id")%></td>
    </tr>
</table>
</body>
</html>

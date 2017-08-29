<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/21
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/chapter1/zhangyang/week7_day_03/css/table.css">
</head>
<body>
<form action="/AddStudentServlet" method="post">
    <table>
        <tr>
            <td>学号</td>
            <td><input type="text" name="sno"/></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="sname" /></td>
        </tr>
        <tr>
            <td>出生年月</td>
            <td><input type="text" name="birthday" /></td>
        </tr>
        <tr>
            <td>专业</td>
            <td><input type="text" name="major" /></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" /></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="radio" name="gender" value="0" />男 <input
                    type="radio" name="gender" value="1" />女</td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="添加" /></td>
        </tr>
    </table>
</form>
</body>
</html>

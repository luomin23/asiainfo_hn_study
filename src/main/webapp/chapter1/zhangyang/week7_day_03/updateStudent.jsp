<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/21
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/chapter1/zhangyang/week7_day_03/css/table.css">
</head>
<body>
<form action="/UpdateStudentServlet?sno=${student.sno }" method="post">
    <table>
        <tr>
            <td>学号</td>
            <td><input type="text" name="sno" value="${student.sno }"
                       disabled="disabled" /></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="sname" value="${student.sname }" /></td>
        </tr>
        <tr>
            <td>出生年月</td>
            <td><input type="text" name="birthday" value="${student.birthday }" />
                </td>
        </tr>
        <tr>
            <td>专业</td>
            <td><input type="text" name="major" value="${student.major }" /></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" value="${student.age }" /></td>
        </tr>

        <tr>
            <td>性别</td>
            <td><c:choose>
                <c:when test="${student.gender == 1 }">
                    <input type="radio" name="gender" value="0" />男
                    <input type="radio" name="gender" value="1" checked="checked" />女
                </c:when>
                <c:otherwise>
                    <input type="radio" name="gender" value="0" checked="checked" />男
                    <input type="radio" name="gender" value="1" />女
                </c:otherwise>
            </c:choose></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="修改" /></td>
        </tr>
    </table>
</form>
</body>
</html>

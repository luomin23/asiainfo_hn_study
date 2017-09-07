<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/25
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${currentpageno>=1}">
        <a href="currentpageno=1">首页</a>
        <a href="/GetLimitStudent?currentpageno=${currentpageno-1}">上一页</a>
    </c:if>
    <c:if test="${currentpageno==1}">
        <a href="/GetLimitStudent?currentpageno=${currentpageno+1}">下一页</a>
        <a href="/GetLimitStudent?currentpageno=${PageCount}">尾页</a>
    </c:if>
    <table width="80%" border="1">
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>出生年月</td>
            <td>专业</td>
            <td>年龄</td>
            <td>性别</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${StudentList}" var="s">
            <tr>
                <td>${s.sno}</td>
                <td>${s.sname }</td>
                <td>${s.birthday }</td>
                <td>${s.major }</td>
                <td>${s.age }</td>
                <td>${s.gender }</td>
                <td><a href="/RemoveStudentServlet?sno=${s.sno}">删除</a>
                    <a href="/GetStudentServlet?sno=${s.sno}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

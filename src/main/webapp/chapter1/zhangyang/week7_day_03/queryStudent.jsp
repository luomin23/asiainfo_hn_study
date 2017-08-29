<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/21
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/chapter1/zhangyang/week7_day_03/css/q.css">
</head>
<body>
<form action="/QueryStudentBySname" method="post">
    学生的姓名<input type="text" name="keyword" /><input type="submit"
                                                    value="模糊查询" />
</form>
    <a href="/chapter1/zhangyang/week7_day_03/addStudent.jsp">添加学生信息</a>
    <br /><br />
<table width="80%" border="1" class="t1">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>出生年月</td>
        <td>专业</td>
        <td>年龄</td>
        <td>性别</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="s">
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
    <c:if test="${currentpageno>1}">
        <a href="/QueryStudentServlet?currentpageno=1">首页</a>
        <a href="/QueryStudentServlet?currentpageno=${currentpageno-1}">上一页</a>
    </c:if>
        ${requestScope.currentpageno}/${requestScope.PageCount}
    <c:if test="${currentpageno<PageCount}">
        <a href="/QueryStudentServlet?currentpageno=${currentpageno+1}">下一页</a>
        <a href="/QueryStudentServlet?currentpageno=${PageCount}">尾页</a>
    </c:if>
</body>
</html>

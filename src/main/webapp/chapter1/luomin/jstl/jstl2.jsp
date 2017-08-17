<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<div style="color:red;font-size:30px;">条件判断标签的使用(c:if,c:shoose,c:when,c:otherwise)</div>
<hr />
<div>
    <div style="color:red">c:if的使用</div>
    <%
        request.setAttribute("result",true);
    %>
    <c:set var="userName" value="张三"/>
    <c:if test="${result == true}"  var="flag">
        欢迎${sessionScope.userName}光临!
    </c:if>
    <br />
    你选择的答案：${flag}
    <hr />
    <%
        HashMap map = new HashMap();
        map.put("mark",1);
        request.setAttribute("result1",map);
    %>
    <br />
    <c:if test="${result1.mark == 1}">
        还可以通过嵌套使用
    </c:if>

    <hr />
    <div style="color:red">c:choose,when,otherwise的使用</div>
    <%
        request.setAttribute("month",2);
    %>
    <c:choose>
        <c:when test="${month>0 && month<4}">春</c:when>
        <c:when test="${month>3 && month<7}">夏</c:when>
        <c:when test="${month>6 && month<10}">秋</c:when>
        <c:when test="${month>9 && month<13}">冬</c:when>
        <c:otherwise>错误</c:otherwise>
    </c:choose>

</div>
<hr />

</body>
</html>
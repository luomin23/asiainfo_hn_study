<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/17
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
JSTL和El表达式配合使用<br>
<c:forEach var="i" begin="1" end="10">
    ${i}
</c:forEach>
</body>
</html>

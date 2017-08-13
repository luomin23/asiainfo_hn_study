<%@ page import="java.util.Scanner" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ include file="Test.jsp"%>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" CONTENT="text/html";charset="UTF-8">
    <title>指令</title>
</head>
<body>
    <h1>include 指令</h1>
    <%@ include file="Test.jsp"%>
    <h2>forward动作</h2>

    <jsp:forward page="HelloWord.jsp"></jsp:forward>




</body>
</html>

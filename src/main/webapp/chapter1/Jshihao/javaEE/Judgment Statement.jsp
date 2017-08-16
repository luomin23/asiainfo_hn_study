<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/8/15
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%! int day = 3; %>
<html>
<head>
    <title>判断语句</title>
</head>
<body>
<%   if  (  day == 1 | day == 7) { %>
<p>今天是周末</p>
<%   }   else  {  %>
<p>今天不是周末</p>
<%   }   %>
</body>
</html>

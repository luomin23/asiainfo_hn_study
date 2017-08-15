<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/14
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String  password = request.getParameter("password");
    String pa ="";
    if("zhang".equals(username)&&"12345".equals(password)){
        //response.sendRedirect("index.jsp");
        pa="/chapter1/zhangyang/week6_day_01/success.jsp";
    }else{
        pa="/chapter1/zhangyang/week6_day_01/error.jsp";
    }
    request.setAttribute("username", username);
    request.getRequestDispatcher(pa).forward(request, response);
%>
</body>
</html>

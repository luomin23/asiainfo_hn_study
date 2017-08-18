<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/8/17
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>set 和 get 属性</title>
</head>
<body>
<jsp:useBean id="students"
class="com.asiainfo.chapter1.Jiashihao.Servlet817.StudentsBean">
    <jsp:setProperty name="students" property="firstName"
                     value="赵"/>
    <jsp:setProperty name="students" property="lastName"
                     value="钱"/>
    <jsp:setProperty name="students" property="age"
                     value="23"/>
</jsp:useBean>
<p>名字：<jsp:getProperty name="students" property="firstName"/></p>
<p>姓氏：<jsp:getProperty name="students" property="age"/></p>
<p>年龄：<jsp:getProperty name="students" property="age"/></p>
</body>
</html>

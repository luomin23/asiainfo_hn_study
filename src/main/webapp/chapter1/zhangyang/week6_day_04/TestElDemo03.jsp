<%@ page import="com.asiainfo.chapter1.zhangyang.week6_day_04.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/17
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User("tom","123");
    pageContext.setAttribute("user",user);
%>
User:<br>
name=${user.name},password=${user.password}<br>
<%
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    session.setAttribute("list",list);

    Map map = new HashMap();
    map.put("z",12);
    map.put("l",2);
    map.put("c",4);
    application.setAttribute("map",map);
%>
list = ${list[0]}<br>
map = ${map.z}
</body>
</html>

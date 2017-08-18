<%@ page import="com.asiainfo.chapter1.liuwy.zuoye.Person" %>
<%@ page import="com.asiainfo.chapter1.liuwy.zuoye.PersonBIZ" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2017/8/16
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String name=request.getParameter("name");
//    String phone=request.getParameter("phonenumber");
    String emil=request.getParameter("emil");
    Person person=new Person(name,111,"henan",emil,1995);
    PersonBIZ personBIZ=new PersonBIZ();
    if(personBIZ.save(person)){%>
注册成功！

    <%}else {%>
注册失败！
   <% }
%>
</body>
</html>

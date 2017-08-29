<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.asiainfo.chapter1.zhangle.MailWorks.Mail" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Mail m=new Mail();
        m.setName("zl");
        m.setTelephone("12345678911");
        m.setAddress("wenh");
        m.setEmail("2355@qq.com");
        m.setBorn("2000/8/8");
        Mail m1=new Mail();
        m.setName("zl1");
        m.setTelephone("12345678911");
        m.setAddress("wenh");
        m.setEmail("2355@qq.com");
        m.setBorn("2000/8/8");
        Mail m2=new Mail();
        m.setName("zl2");
        m.setTelephone("12345678911");
        m.setAddress("wenh");
        m.setEmail("2355@qq.com");
        m.setBorn("2000/8/8");
        List<Mail> list=new ArrayList<Mail>();
        list.add(m);
        list.add(m1);
        list.add(m2);
        request.setAttribute("mails",list);

    %>
    <c:forEach var="m" items="${requestScope.mails}">
        <h3>${m}:</h3>
        <h3>${m.key}:${m.value.name}</h3>

    </c:forEach>
</body>
</html>

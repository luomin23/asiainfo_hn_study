<%--
  Created by IntelliJ IDEA.
  User: del
  Date: 2017/8/16
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.asiainfo.chapter1.zhangle.MailWorks.Mail" %>

<html>
<head>
    <title>EL表达式</title>
</head>
<body>
    <%
        PrintWriter pw=response.getWriter();
        request.setAttribute("name","zl");
        session.setAttribute("name","zle");
        request.setAttribute("name","zl1");
        Mail mail=new Mail();
        mail.setName("Hello");
        mail.setTelephone("12345678912");
        request.setAttribute("mails",mail);

    %>
    <h3>requestScope.name=${requestScope.name}</h3>
    <h3>sessionScope.name=${sessionScope.name}</h3>
    <h3>EL:${sname}</h3>
    <h3>Script:<%=request.getAttribute("sname")%></h3>
    <h3>requestScope.mails.name=${requestScope.mails.name}</h3>
    <hr />
    <h3>1+2=${1+2}</h3>
    <h3>1%2=${1%2}</h3>
    <h3>1<2=${1<2}</h3>
    <h3>(1>2)&&(2<3)=${(1>2)&&(2<3)}</h3>
    <h3>(1>2)||(2<3)=${(1>2)||(2<3)}</h3>
    <h3>EL:${empty sname} //为true时表示结果不存在 为false时表示结果存在</h3>
    <h3></h3>


</body>
</html>

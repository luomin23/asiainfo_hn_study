<%@ page import="com.asiainfo.chapter1.zhangle.BBSWorks.Entity.User" %><%--
  Created by IntelliJ IDEA.
  User: del
  Date: 2017/8/22
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录首页</title>
    <link rel="stylesheet" type="text/css" href="../Tribune/styles/headStyles.css" />
</head>
<body>
<div class="head">
    <img src="../Tribune/img/logo.png" />
    <div class="select">
        <ul class="level1">
            <li><a href="#">首页</a></li>
            <li id="zhuce"><a href="Regist.jsp">| 注册</a></li>

        </ul>
    </div>
    <!--登录-->
    <div class="login" id="login">
        <div id="deng">
            <%
                User user=(User)session.getAttribute("userInfo");
            %>
            <h3>欢迎
                <%=user.getName()%>
                用户,您的使用</h3>
        </div>
        <div id="person">
            <a href="person.jsp">USER</a>
        </div>

    </div>
</div>

</body>
</html>

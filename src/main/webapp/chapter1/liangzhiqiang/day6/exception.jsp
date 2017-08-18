<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/18
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html；charset=UTF-8">
    <title>异常信息</title>
</head>
<body>
<h3>以下是异常信息:</h3>
<hr>
<%
    int x=9,y=0,z;
    try {
        z=x/y;
    }catch (Exception e){

        out.println(e.toString()+"<br>");
    }
    finally {
        out.println("产生了除以0的错误！");
    }
%>
<hr>
</body>
</html>

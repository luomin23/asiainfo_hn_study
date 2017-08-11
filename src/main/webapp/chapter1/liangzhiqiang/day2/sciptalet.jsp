<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/11
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%--jsp不会被其他线程共享，用户对该变量的作用不会影响其他用户，当变量所有页面关闭时该变量就会被销毁--%>
<%@ page contentType="text/html;pageEnconding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type"content="text/html"; charset="UTF-8">
    <title>脚本示例</title>
</head>
<body>
<%!
    int x=6;
%>
<table>
    <%
        if (x==1){
    %>
    <tr>
        <td>欢迎登录，你的权限是管理员！</td>
    </tr>
    <%
        }
        else {



    %>
    <tr>
        <td>欢迎登陆，你的权限是普通用户！</td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>

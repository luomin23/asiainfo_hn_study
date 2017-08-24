<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/21
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncodingt=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>页面检查</title>
</head>
<body>
<%
    String name=request.getParameter("userName");
    String password=request.getParameter("userPassword");
    String message;
    if (name.equals("liang123")&&password.equals("123456")){
        message="可以登录系统";
    }else {
        message="用户名账号或密码输入错误";
    }
%>
<script type="text/javascript">
    alert("<%=message%>");
    window.location.href='login.jsp';
</script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/8/17
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改结果</title>
</head>
<body>
    <%String result=(String)request.getAttribute("result");%>
    <%=request.getSession().getAttribute("username")%>,你好：<br>
    <%=result%><br>
    修改后的密码为：<%=request.getAttribute("pwd")%>,请牢记！<br>
    <a href="/toUserIndex.do">返回主页</a>
</body>
</html>

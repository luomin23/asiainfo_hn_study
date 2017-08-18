<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/17
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>数据处理页面</title>
</head>
<body>
<%
    String textContent=request.getParameter("name");
    String buttonName=request.getParameter("submit");
%>
获取到客户端提交的文本和按钮如下：
<hr>
文本框输入信息：<%=textContent%>
<br>
按钮信息：<%=buttonName%>
<hr>
</body>
</html>

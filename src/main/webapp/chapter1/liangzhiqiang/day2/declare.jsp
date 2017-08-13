<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/11
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type"content="text/html;charset=UTF-8">
    <title>声明和变量方法实例</title>
</head>
<body>
<%!
String str="jsp技术带你走进动态网页开发时代！";
%>
<%!
String print(){
    return str;
}
%>
<%=print()%>

</body>
</html>

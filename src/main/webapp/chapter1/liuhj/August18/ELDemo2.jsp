<%--
  Created by IntelliJ IDEA.
  User: 刘豪杰
  Date: 2017/8/18
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取常用的开发对象</title>
</head>
<body>
<%
    pageContext.setAttribute("name","liu");
    request.setAttribute("name","wu");
%>
    ${pageScope.name}
    ${requestScope.name}
    ${param.name}  ${paramValues.like[2]}
    ${cookie.JSESSIONID.name}${cookie.JSESSIONID.value}



</body>
</html>

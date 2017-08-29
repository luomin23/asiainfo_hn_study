<%--
  Created by IntelliJ IDEA.
  User: 刘豪杰
  Date: 2017/8/18
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 Form IncludeForward JSP.......
<%
  //request.getRequestDispatcher("/Demo.jsp").include(request,response); 以前写代码的方式
   // pageContext.include("/index.jsp");在JSP页面的书写方式，PageContext作为九大隐式对象的入口，可以省略书写
      pageContext.forward("/index.jsp");
%>
<%--
<jsp:include page="/index.jsp"> </jsp:include>
--%>
<jsp:forward page="/index.jsp"></jsp:forward>

</body>
</html>

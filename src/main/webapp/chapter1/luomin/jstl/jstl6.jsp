
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<div style="color:red;font-size:30px;">set,remove,catch 标签使用</div>
<div style="color:red">set的使用</div>
<hr />
<c:set var="userName" value="张三" scope="request" />
<c:set var="userName" value="李四" scope="session" />
<c:set var="userName" value="王五" scope="application" />
<%=request.getAttribute("userName") %><br/>
<%=session.getAttribute("userName") %><br/>
<%=application.getAttribute("userName") %><br/>

<br/>
<div style="color:red">remove的使用</div>
<hr />
<c:remove var="userName" scope="request" />
<c:remove var="userName" scope="session" />
<c:remove var="userName" scope="application" />
remove后的值：<%=request.getAttribute("userName") %><br/>
remove后的值：<%=session.getAttribute("userName") %><br/>
remove后的值：<%=application.getAttribute("userName") %><br/>
<br/>

<div style="color:red">catch的使用</div>
<hr />
<c:catch var="error_Message">
    <%
        int i = Integer.parseInt("a");
    %>
</c:catch>
${error_Message}
</body>
</html>
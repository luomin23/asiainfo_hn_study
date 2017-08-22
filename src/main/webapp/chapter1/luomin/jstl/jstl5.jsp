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

<div style="color:red;font-size:30px;">EL表达式使用</div>
<div style="color:red">算术运算符</div>
<hr />
加：1+1    = ${1+1}<br/>
减：1-1    = ${1-1}<br/>
乘：1*2    = ${1*2}<br/>
除：    3/2 = ${3/2}<br/>
模：    3%2 = ${3%2}<br/>
<div style="color:red">关系运算符</div>
<hr />
1==1:${1==1}<br/>
1!=1:${1!=1}<br/>
1<2:${1<2}<br/>
1>2:${1>2}<br/>
1<=2:${1<=2}<br/>
1>=2:${1>=2}<br/>
<div style="color:red">逻辑运算符</div>
<hr />
<%
    request.setAttribute("a",true);
    request.setAttribute("b",false);
%>
a=true,b=false<br/>
${a && b}<br/>
${a || b}<br/>
${!a}<br/>

<div style="color:red">三元运算符</div>
<hr />
> 1 ? "真" : "假" = ${1 > 1 ? "真" : "假"}

<div style="color:red">empty会帮你判断size=0的情况</div>
<hr />
<% request.setAttribute("list",new  ArrayList());%>
<c:if test="${empty list}">empty判断list没有数据</c:if>
</body>
</html>
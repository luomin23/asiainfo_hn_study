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

<div style="color:red;font-size:30px;">格式化标签的使用</div>
<hr />

<div style="color:red">fmt:formatNumber的使用</div>
<fmt:formatNumber value="0.3" type="number"/><br />
<fmt:formatNumber value="0.3" type="currency"/><br />
<fmt:formatNumber value="0.3" type="percent"/><br />
<br />
<hr />
<div style="color:red">fmt:formatNumber的使用(精确小数点)</div>
<fmt:formatNumber value="12.31" pattern=".0000"/><br/>
<fmt:formatNumber value="1245678.61" pattern="#"/><br/>
<br />
<hr />
<div style="color:red">fmt:formatDate的使用</div>
<fmt:formatDate value="<%=new Date()%>" /><br/>
<fmt:formatDate value="<%=new Date()%>" type="time"/><br/>
<fmt:formatDate value="<%=new Date()%>" pattern="yyyy/MM/dd hh:mm:ss" /><br />
<fmt:formatDate value="<%=new Date()%>" pattern="yyyy-MM-dd HH:mm:ss" /><br />
<fmt:formatDate value="<%=new Date()%>" pattern="yyyy年MM月dd日 hh小时mm分钟ss秒" /><br />
<fmt:formatDate value="<%=new Date()%>" pattern="yy/MM/dd hh:mm:ss" /><br />

<hr>


</body>
</html>
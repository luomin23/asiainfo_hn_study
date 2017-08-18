<!-- e1 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    request.setAttribute("attr_request","attr_request值");
    session.setAttribute("attr_session","attr_session值");
    application.setAttribute("attr_application","attr_application值");
%>
<div>
    <div style="color:red;font-size:30px;">c:out标签的使用</div>
    <div style="color:red">可以获取request，session，application的值</div>
    parameter的值(得到不了)：<c:out value="${name}"/><br />
    <c:out value="${attr_request}"/>---${attr_request}<br />
    <c:out value="${attr_session}"/>---${attr_session}<br />
    <c:out value="${attr_application}"/>---${attr_application}<br />
</div>
<hr />
<%
    request.setAttribute("same_name","request值");
    session.setAttribute("same_name","session值");
    application.setAttribute("same_name","application值");
%>
<div>
    <div style="color:red">相同名字的：request优先于session,session优先于application</div>
    <c:out value="${same_name}"/><br />
</div>

<hr />
<%
    HashMap map = new HashMap();
    map.put("name","嵌套值");
    request.setAttribute("result",map);

    ArrayList list = new ArrayList();

    HashMap map1 = new HashMap();
    map1.put("name","张三");
    list.add(map1);

    HashMap map2 = new HashMap();
    map2.put("name","李四");
    list.add(map2);
    request.setAttribute("list",list);
%>
<div>
    <div style="color:red">可以嵌套获取值，java也一样</div>
    <c:out value="${result.name}"/> --- ${result.name}<br />
    <c:out value="${list[0].name}"/>--- ${list[0].name}<br />
    <c:out value="${list[1].name}"/>---${list[1].name}<br />
</div>

</body>
</html>
<!-- e2 -->

<!-- e3 -->

<!-- e4 -->

<!-- e5 -->

<!-- e6 -->

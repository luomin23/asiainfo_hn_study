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

<div style="color:red;font-size:30px;">循环标签的使用(c:forEach,c:fortokens)</div>
<hr />
<div>
    <div style="color:red">c:forEach的使用</div>

        <%
    List<String> list = new ArrayList<String>();
    list.add("aaa1");
    list.add("aaa2");
    list.add("aaa3");
    request.setAttribute("list",list);
%>
    <c:forEach items="${list}" var="str" varStatus="xh">
        ${xh.count}序号从1开始,
        ${xh.index}序号从0开始,
        ${xh.last}最后一个序号,
        ${xh.first}第一个序号,
    :${str}<br/>
    </c:forEach>
    <br />
    <hr />
    <div style="color:red">c:forEach的使用(空指针不会报错)</div>
        <% request.setAttribute("list1",null);%>
    <c:forEach items="${list1}" var="str">
        ${str}<br/>
    </c:forEach>
    <br />
    <hr />
    <div style="color:red">c:forEach的使用(数组使用)</div>
        <%
    String[] nums = { "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    request.setAttribute("nums",nums);
%>
    <c:forEach items="${nums}" var="num">
        ${num}<br />
    </c:forEach>
    <br />
    <hr />
    <div style="color:red">c:forEach的使用(下标从0开始)</div>
    <c:forEach items="${nums}" var="num" begin="1" end="7" step="2">
        ${num}<br />
    </c:forEach>
    <br />


    <div style="color:red">c:forEach的使用(数组使用)</div>
        <%
        ArrayList array = new ArrayList();
        HashMap m = new HashMap();
        m.put("name","张三");
        array.add(m);
        m = new HashMap();
        m.put("name","李四");
        array.add(m);
        m = new HashMap();
        m.put("name","王五");
        array.add(m);
        m = new HashMap();
        m.put("name","赵六");
        array.add(m);
        m = new HashMap();
        m.put("name","林奇");
        array.add(m);
        request.setAttribute("result_list", array);
%>
    <c:forEach items="${result_list}"  var="user">
        ${user.name}<br />
    </c:forEach>

    <br />
    <hr />
    <div style="color:red">c:forTokens的使用</div>
    <c:forTokens items="a:b:c:d" delims=":" var="token">
        <c:out value="${token}"/>
    </c:forTokens>
</body>
</html>
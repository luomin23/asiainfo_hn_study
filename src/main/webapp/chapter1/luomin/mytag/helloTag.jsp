<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/mytag" prefix="my" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here 66666</title>
</head>
<body>
<my:getIp/>
<br>

<my:print count="5">
    hello tag
</my:print>

<br>

<!-- 没有参数，没有body内容的 -->
<my:displayDate/>
<!-- 有参数，但没有body内容的 -->
<my:displayDateTwo pattern='MM/dd HH:mm:ss'/>
<!-- 有参数，有body内容的 -->
<my:iterator count="10">Hello world jsp taglib !!!</my:iterator>

</body>
</html>
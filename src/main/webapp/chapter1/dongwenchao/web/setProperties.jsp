<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/15 0015
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>设置属性值应用实例</title>
</head>
<body>
<form method="post" action="">
    用户:<input type="text"name="user">
    密码:<input type="text" name="pass">
    <input type="submit" value="确定">
    <input type="reset"value="清除">
</form>
<jsp:useBean id="login" class="com.asiainfo.chapter1.dongwenchao.web.Login"/>
<jsp:setProperty name="login" property="*"></jsp:setProperty>
<p>用户名</p>
<jsp:getProperty name="login" property="user"/>
<p>密码</p>
<jsp:getProperty name="login" property="pass"/>
</body>
</html>

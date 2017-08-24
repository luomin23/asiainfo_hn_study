<%@ page import="com.asiainfo.chapter1.liangzhiqiang.BBSzuoye.Address" %><%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/23
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>


    <title>edit.jsp</title>

</head>

<body>
<%
    Address address =  (Address)request.getAttribute("address");
%>
<form  action="AddressServlet?method=edit&id=<%= address.getId() %>" method="post">
    Name:<input type="text" name="name" value="<%= address.getName() %>"><br>
    Street:<input type="text" name="street" value="<%= address.getStreet() %>"><br>
    City:<input type="text" name="city" value="<%= address.getCity() %>"><br>
    State:<input type="text" name="state" value="<%= address.getState() %>"><br>
    Zip:<input type="text" name="zip" value="<%= address.getZip() %>"><br>
    <input type="submit" value="Edit"><br>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/23
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>


    <title>My JSP 'index.jsp' starting page</title>

</head>

<body>
<form  action="AddressServlet?method=add" method="post">
    Name:<input type="text" name="name"><br>
    Street:<input type="text" name="street"><br>
    City:<input type="text" name="city"><br>
    State:<input type="text" name="state"><br>
    Zip:<input type="text" name="zip"><br>
    <input type="submit" value="Add"><br>
</form>
</body>
</html>
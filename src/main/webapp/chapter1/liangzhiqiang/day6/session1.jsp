<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/18
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>对象实用实例1</title>
</head>
<body>
<%
    int number=10001;
    Object obj=session.getAttribute("number");
    if (obj==null) {
        session.setAttribute("number", String.valueOf(number));
    }else{
    number=Integer.parseInt(obj.toString());
        number+=1;
        session.setAttribute("number",String.valueOf(number));
        }

%>
你是第<%=number%>个用户访问本网站

</body>
</html>

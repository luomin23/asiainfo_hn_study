<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/10
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" %>
<html>
<head>
    <meta http-equiv="Content-Type"content="text/html;charset=UTF-8">
    <title>实例表达式</title>
    </head>
<body>
<%!
    String name="亚信欢迎你";
    String urlAddress="http://asiainfo.hirede.com/CareerSite/SiteIndex";
    String page="www.sohu.com";
%>
<br>
用户名：<%=name%>
<br>
<a href="<%=urlAddress%>">亚信官方网站</a>

<form action="<%=page%>">
    </form>


</body>
</html>

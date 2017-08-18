<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/17
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>数据处理</title>
</head>
<body>
<%
    String address=request.getParameter("link");
    if (address!=null){
        if (address.equals("qhdxcbs"))
            response.sendRedirect("http://www.tup.tsinghua.edu.cn/");
        else
            response.sendRedirect("http://www.moe.edu.cn/");
    }
%>

</body>
</html>

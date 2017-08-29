<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/24
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        body a{
            text-decoration: none;
        }
    </style>
</head>
<body>
<form action="/UploadServlet" method="post" enctype="multipart/form-data" >
   文件选择：<input type="file" name="file">
    <input type="submit" value="上传"><br>
    <a href="/chapter1/zhangyang/week7_day_03/test.jsp">下载</a>
</form>
</body>
</html>

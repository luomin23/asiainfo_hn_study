<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2017/8/18
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎您！“<%=session.getAttribute("username")%>”<br>
您可以做以下操作：
<form action="/selectservlet.do?id=<%=session.getAttribute("id")%>" method="post">
    1、<input type="submit" value="查看我的信息">
</form>
<form name="uploadForm" method="POST"
      enctype="MULTIPART/FORM-DATA"
      action="/uploadservlet.do">
2、上传文件<br>
    上传用户：<input type="text" name="username" value="<%=session.getAttribute("username")%>"><br>
    上传文件1：<input type="file" name="file1"><br>
    上传文件2：<input type="file" name="file2"><br>
    <input type="submit" value="提交">
</form><br>
<button onclick="history.back()">返回</button>
</body>
</html>

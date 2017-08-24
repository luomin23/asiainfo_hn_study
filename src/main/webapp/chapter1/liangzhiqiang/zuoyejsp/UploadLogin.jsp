<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/22
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>实现文件的上传下载</title>
</head>

<script type="text/javascript" src="js/jquery-1.11.1.js">
</script>
<body>
<h2>实现文件的上传下载</h2>
<form action="uploadServlet" method="post" enctype="multipart/form-data" >
    请选择文件：<input id="file" name="file" type="file" />
    <input type="submit" value="上传"  />${result}
</form>
下载：<a href="downloadServlet?filename=FileTest.txt">fileTest.txt</a> ${errorResult}
</body>
</html>
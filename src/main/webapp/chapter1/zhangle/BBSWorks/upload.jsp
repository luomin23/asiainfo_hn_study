<%@ page import="java.io.File" %><%--
  Created by IntelliJ IDEA.
  User: del
  Date: 2017/8/23
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
    <script type="text/javascript" src="JS/regist.js" ></script>
</head>
<body>
    <div>
        <%
            String f=(String) request.getAttribute("upimg");
            System.out.println(f);
        %>
        <img src="/chapter1/zhangle/BBSWorks/upload/logo.png" width="100px" height="100px" />
        <img src="/chapter1/zhangle/BBSWorks/upload/<%=f%>" id="imgs" width="100px"  height="100px" />
    </div>
    <form action="/zl/upfile" enctype="multipart/form-data" method="POST" >

        图片:<input type="file" name="myfile" /><br>
        <input type="submit" value="上传" onclick="show()"/>
    </form>s
    <div>
        <a href="/zl/downfile?filename=logo.png">
            下载:<img src="/chapter1/zhangle/BBSWorks/upload/logo.png" width="100px" height="100px" />
        </a>
    </div>
<script>
    function show() {
        var ig=document.getElementById("imgs");
        ig.style="display:' '";


    }
</script>

</body>
</html>

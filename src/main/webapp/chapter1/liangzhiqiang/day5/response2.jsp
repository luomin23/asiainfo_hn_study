<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/17
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>对象应用</title>

</head>
<body>
<hr>
<%
    request.setBufferSize(10240);
%>
<%=request.getBufferSize()
<br>
%>
<%
    request.setCharacterEncoding("UTF-8");
%>
<%=request.getCharacterEncoding()
<br>

%>
网站友情链接：
<hr>
<form action="responseCheck2.jsp" method="post">
    <select name="link">
        <optgroup value="qhdxcbs" selected>
            清华大学出版社
        </optgroup>
        <option value="jyb">中华人民共和国教育部</option>
    </select>
    <input type="submit" name="submit" value="确定" >
</form>

</body>
</html>

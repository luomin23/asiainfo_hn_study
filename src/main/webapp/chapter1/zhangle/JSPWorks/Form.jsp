<%--
  Created by IntelliJ IDEA.
  User: del
  Date: 2017/8/15
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" charset="UTF-8">
    <title>get/post</title>
</head>
<body>
<form action="../../../get" method="get">
    <table>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name" value="姓名" /></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
            <td rowspan="3" align="top">爱好:</td>
            <td><input type="checkbox" name="check"  />看书</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="check" />写字</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="check" />听音乐</td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="提交" /></td>
        </tr>
    </table>


</form>

</body>
</html>

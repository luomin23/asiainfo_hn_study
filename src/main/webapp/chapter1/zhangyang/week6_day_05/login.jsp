<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/18
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/LoginCheckServlet" method="post">
    <table>
        <tr>
            <th colspan="2">登录界面</th>
        </tr>
        <tr>
            <td>账号：</td>
            <td><input type="text" id="username" name="username"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td>类型：</td>
            <td>
                <input type="radio" name="ra" value="l" checked="checked"/>一般研究人员
                <input type="radio" name="ra" value="m" />管理员研究人员
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
                <font color="red">${error}</font>
            </td>
        </tr>
        </table>
    </form>
</body>
</html>

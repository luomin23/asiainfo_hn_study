<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/18
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/RegisterServlet" method="post">
        <table align = "center" border="1" style="border-collapse: collapse;">
            <tr>
                <td colspan="2">用户注册</td>
            </tr>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="userName" required/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td>
                    <input type="password" name="userPassword" required/>
                </td>
            </tr>
            <tr>
                <td>性别：</td>
                <td>
                    <input type="radio" name="userSex" value="男" checked="checked" />男
                    <input type="radio" name="userSex" value="女" />女
                </td>
            </tr>
            <tr>
                <td class="tdstyle" colspan="2">
                    <input type="submit" value="注册" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>

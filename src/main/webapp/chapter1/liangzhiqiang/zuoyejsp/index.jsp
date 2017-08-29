<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/21
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>登录界面</title>
    <script type="text/javascript">
        function loginCheck () {
            if (loginForm.userName.value==""){
                alert("用户名不能为空，请输入用户名");
                loginForm.userName.focus();
                return false;
            }
            if (loginForm.userPassworld.value==""){
                alert("用户名密码不能为空，请输入用户名密码")
                loginForm.userPassworld.focus();
                return false;
            }


        }
    </script>
</head>

<body>
<form name="loginForm" action="check.jsp" method="post" onsubmit="return loginCheck();">
    <table align="center">
        <tr align="center">
            <td colspan="2">
                <h1>欢迎登录网络论坛</h1>
            </td>
        </tr>
        <tr>
        <td>用户名：</td>
        <td><input name="userName" type="text"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input name="userPassword" type="password"/></td>
            </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
                <input type="reset" value="重置">

            </td>
</tr>
    </table>
</form>

</body>
</html>

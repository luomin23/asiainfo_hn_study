<%--
  Created by IntelliJ IDEA.
  User: del
  Date: 2017/8/21
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BBS注册界面</title>
    <link rel="stylesheet" type="text/css" href="../Tribune/styles/regist.css">
    <script type="text/javascript" src="JS/regist.js" ></script>
</head>
<body>

    <div class="head">
        <a  href="Index.jsp"><img src="../Tribune/img/logo.png" /></a>
        <div class="headend">
            <a href="Index.jsp">论坛首页</a>
        </div>
    </div>
    <div class="content">
        <form action="/zl/registServlet" method="post" id="form">
            <table id="table">
                <tr>
                    <td>手机号：</td><td><input type="text" name="telephone" id="telephone" required size="11"/>&nbsp;<span>请输入11位电话号码</span></td>
                </tr>
                <tr>
                    <td>密码：</td><td><input type="password" name="pwd" id="pwd" required maxlength="20" />&nbsp;<span>请输入8-20个字母、特殊符号、数字</span></td>
                </tr>
                <tr>
                    <td>确认密码：</td><td><input type="password" name="repwd" id="repwd" required/>&nbsp;<span>请与密码的内容保持一致</span></td>
                </tr>
                <tr>
                    <td ></td><td><input style="margin-left: 45% "  id="submit" type="submit" value="注册" onclick="return registCheck()" /></td>
                </tr>

            </table>
        </form>
    </div>


</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: del
  Date: 2017/8/22
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录首页</title>
    <link rel="stylesheet" type="text/css" href="../Tribune/styles/headStyles.css" />
    <script type="text/javascript" src="JS/regist.js" ></script>
</head>
<body>
    <div class="head">
        <img src="../Tribune/img/logo.png" />
        <div class="select">
            <ul class="level1">
                <li><a href="#">首页</a></li>
                <li id="zhuce"><a href="Regist.jsp">| 注册</a></li>

            </ul>
        </div>
        <!--登录-->
        <div class="login" id="login" style="display:block">
            <div id="deng">
                <form action="/zl/loginServlet" method="post">
                    用户名:<input type="text" name="loginName" id="user" required maxlength="20" /><span>输入11位手机号</span>
                    密码:<input type="password" name="loginPwd" id="password" required maxlength="20" />
                    <input type="submit" id="button" value="登陆" onclick="test()" />
                </form>
            </div>

        </div>
    </div>

</body>
</html>

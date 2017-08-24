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
    <link rel="stylesheet" type="text/css" href="styles/headStyles.css" />
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
                    用户名:<input type="text" name="loginName" id="user" required maxlength="20" /><span>输入11位手机号</span><br />
                    密 码:<input type="password" name="loginPwd" id="password" required maxlength="20" />
                    &nbsp;&nbsp;<input type="submit" id="button" value="登陆" onclick="test()" />
                </form>
            </div>


        </div>
    </div>
    <script>
        function test(){
            //登录失败
            var name=document.getElementById("user").value;
            var pwd=document.getElementById("password").value;
            if(!(/^1[3|4|5|8][0-9]{9}$/.test(name))){
                alert("不符合要求，重新输入用户名");
                document.getElementById("user").focus();
                return false;
            }if(!(/^(?![A-Z]+$)(?![a-z]+$)(?!\d+$)(?![\W_]+$)\S{8,20}$/.test(pwd))){
                alert("不符合要求，重新输入密码");
                document.getElementById("pwd").focus();
                return false;
            }
            //登录成功
            if(/^1[3|4|5|8][0-9]{9}$/.test(name) && (/^(?![A-Z]+$)(?![a-z]+$)(?!\d+$)(?![\W_]+$)\S{8,20}$/.test(pwd))){
                return true;
            }
        }
    </script>
    <div class="content">
        <table id="table">
            <tr>
                <td id="tdleft">
                    <table class="left">
                        <tr>
                            <td><a href="TopTalks.jsp">校园时间</a><span>可去评论</span></td>
                        </tr>
                        <tr>
                            <td><a href="#" target="main">经济交流</a></td>
                        </tr>
                        <tr>
                            <td><a href="#" target="main">职业交流</a></td>
                        </tr>
                        <tr>
                            <td><a href="#" target="main">情感天地</a></td>
                        </tr>
                        <tr>
                            <td><a href="#" target="main">游戏地带</a></td>
                        </tr>
                    </table>

                </td>
                <td id="tdright">
                    <iframe name="main" src=""></iframe>

                </td>
            </tr>
        </table>


    </div>

</body>
</html>

<%@ page import="com.asiainfo.chapter1.zhangle.BBSWorks.Entity.User" %><%--
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

</div>

</body>
</html>

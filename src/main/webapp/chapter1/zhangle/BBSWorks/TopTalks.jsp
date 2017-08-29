<%--
  Created by IntelliJ IDEA.
  User: del
  Date: 2017/8/23
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>话题专区</title>
    <meta charset="UTF-8">
    <title>评论</title>
    <link rel="stylesheet" type="text/css" href="styles/headStyles.css" />
    <link rel="stylesheet" type="text/css" href="styles/indexschool.css" />
    <script type="text/javascript" src="JS/regist.js" ></script>
</head>
<body>
    <div class="head">
        <img src="img/logo.png" />
        <div class="select">
            <ul class="level1">
                <li><a href="Index.jsp">首页</a></li>
            </ul>
        </div>
    </div>
    <div class="content">
        <table id="table">
            <tr>
                <td id="tdleft">
                    <table class="left">
                        <tr>
                            <td><a href="IndexSchool.jsp" target="main">大学生创业</a></td>
                        </tr>
                        <tr>
                            <td><a href="upload.jsp" target="main">上传话题</a></td>
                        </tr>
                        <tr>
                            <td><a href="/zl/commentsfirst" target="main">查询话题</a></td>
                        </tr>

                    </table>

                </td>
                <td id="tdright">
                    <iframe name="main" src="IndexSchool.jsp"></iframe>

                </td>
            </tr>
        </table>


    </div>

</body>
</html>

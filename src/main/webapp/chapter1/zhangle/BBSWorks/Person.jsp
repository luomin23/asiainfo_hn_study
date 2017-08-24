<%@ page import="com.asiainfo.chapter1.zhangle.BBSWorks.Entity.User" %><%--
  Created by IntelliJ IDEA.
  User: del
  Date: 2017/8/22
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>个人界面</title>
    <link rel="stylesheet" type="text/css" href="/chapter1/zhangle/Tribune/styles/headStyles.css">
    <link rel="stylesheet" type="text/css" href="/chapter1/zhangle/Tribune/styles/person.css">
</head>
<body>
    <div class="head">
        <a  href="../chapter1/zhangle/BBSWorks/IndexUser.jsp"><img src="../chapter1/zhangle/Tribune/img/logo.png" /></a>
        <div class="select">
            <ul class="level1">
                <li><a href="../chapter1/zhangle/BBSWorks/IndexUser.jsp">首页</a></li>
            </ul>
        </div>
    </div>
    <div class="leftpart">

        <h3>选项列表：</h3>
        <ul id="one">
            <li onclick="lookFunction()">查看/完善个人信息</li>
            <li><a href="/chapter1/zhangle/BBSWorks/TopTalks.jsp">话题专区</a></li>
        </ul>

    </div>
    <%
        String sname=request.getParameter("loginName");
        System.out.println("账号："+sname);
    %>
    <div class="rightpart" >
        <!--style="display: none"-->
        <div id="edit">
            <h3>修改个人信息：</h3><hr />
            <form action="/zl/personServlet" method="post">
                <table>
                    <tr>
                        <td>用户名:</td><td><input type="text" name="tele" value="<%=sname%>" /></td>
                    </tr>
                    <tr>
                        <td>昵称:</td><td><input type="text" name="lastname" id="makename" maxlength="20" /></td>
                    </tr>
                    <tr>
                        <td>email:</td><td><input type="text" name="email" id="emails" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" id="button" onclick="return makesure()" style=" text-align: center" value="确认" /></td>
                    </tr>
                </table>
            </form>
        </div>


    </div>
<script>
    function lookFunction(){
        document.getElementById("edit").style="display:' '";
    }
    function makesure(){
        var email=document.getElementById("emails").value;
        if(!(/^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/.test(email))){
            alert("请填写正确的邮箱");
            return false;
        }else{
            if(!confirm("确认提交修改后的个人信息")){
                window.event.returnValue = false;
            }
            return true;
        }

    }
</script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: del
  Date: 2017/8/24
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评论</title>
    <link rel="stylesheet" type="text/css" href="/chapter1/zhangle/BBSWorks/styles/headStyles.css" />
    <link rel="stylesheet" type="text/css" href="/chapter1/zhangle/BBSWorks/styles/indexschool.css" />
</head>
<body>
<div class="head">
    <div class="select">
        <ul class="level1">
            <li><a href="/chapter1/zhangle/BBSWorks/IndexUser.jsp">首页</a></li>
        </ul>
    </div>
</div>
<div class="bbs">
    <h2 align="center">大学生创业</h2>
    <div>
        　　大学生在校自主创业可以做什么 大学生刚毕业可以做什么当今社会大学生可谓到处都是，
        那如何能在这些成千上万的人群中脱颖而出呢，家里有背景的，可以帮其找到好的工作，
        要不就是家族企业，在家族企业中去锻炼， 但毕竟这些人占的比例还是很少的，那我们其他人怎么办，
        只能打工吗？我的回答是 不 ，我们可以自主创业。<br>　
    </div>　
    <label>
        <form action="/zl/talks" method="post"  target="_blank">
            <input type="submit" value="评论" />

        </form>
        <input id="zan" type="button" value="点赞" />
    </label>
</div>
<div class="pinglun">
    <h2>评论区：</h2>
    <ol id="pol">
        <li id="first"><img src="/chapter1/zhangle/BBSWorks/img/541.png" />楼主，慎重思考啊！</li>

    </ol>
    <div id="pdiv">
        <input type="text" id="ptext" maxlength="25" /><input type="button" value="发表" onclick="addPing()" /><span>最多输入25个字</span>
    </div>
</div>
</div>
<script>
    function delPing(){
        if(!confirm("确认要删除这条评论吗？")){
            window.event.returnValue = false;
        }else{
            var ol=document.getElementById("pol");
            var li=document.getElementById("oth");
            ol.removeChild(li);
        }
    }
    function addPing(){
        var li=document.createElement("li");
        li.setAttribute("id","oth");
        li.setAttribute("onclick","delPing()");
        li.innerHTML=document.getElementById("ptext").value;
        var image=document.createElement("img");
        image.setAttribute("src","/chapter1/zhangle/BBSWorks/img/03.jpg");
        var ol=document.getElementById("pol");
        ol.appendChild(li);
        li.appendChild(image);

    }
</script>

</body>
</html>

/**
 * Created by del on 2017/7/17.
 */
/*
* 注册界面验证手机号
* */
function registCheck() {
    var repwd=document.getElementById("repwd").value;
    var pwd=document.getElementById("pwd").value;
    var tele=document.getElementById("telephone").value;
    if(!(/^1[3|4|5|8][0-9]{9}$/.test(tele))){
        alert("不符合要求，重新输入手机号");
        document.getElementById("telephone").focus();
        return false;
    }
    if(!(/^(?![A-Z]+$)(?![a-z]+$)(?!\d+$)(?![\W_]+$)\S{8,20}$/.test(pwd))){
        alert("不符合要求，重新输入密码");
        document.getElementById("pwd").focus();
        return false;
    }
    if(repwd!=pwd){
        alert("确认密码请与密码保持一致");
        document.getElementById("repwd").focus();
        return false;
    }
    if(/^1[3|4|5|8][0-9]{9}$/.test(tele) && (/^(?![A-Z]+$)(?![a-z]+$)(?!\d+$)(?![\W_]+$)\S{8,20}$/.test(pwd)) && (repwd==pwd)){
        return true;
    }

}
/*
* 首页--登录成功
* */
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



function testUser() {
    alert("请先登录");
    document.getElementById("pdiv").style="display:' '";
}
function addPing(){
    var li=document.createElement("li");
    li.setAttribute("id","oth");
    li.setAttribute("onclick","delPing()");
    li.innerHTML=document.getElementById("ptext").value;
    var image=document.createElement("img");
    image.setAttribute("src","img/03.jpg");
    var ol=document.getElementById("pol");
    ol.appendChild(li);
    li.appendChild(image);

}
function commentdelete() {
    if(!confirm("确认要删除这条评论吗？")){
        window.event.returnValue = false;
        return false;
    }else {
        return true;
    }

}
function delPing(){
    if(!confirm("确认要删除这条评论吗？")){
        window.event.returnValue = false;
    }else{
        var ol=document.getElementById("pol");
       // var li=document.getElementById("oth");
        var li=document.getElementsByClassName("li");
        var a;
        for(var i=0;i<li.length;i++){
            a=li[i];
            a.index=i;
        }
    }
}
/*
* 评论全选的复选框
* */
function checkAll() {
   var select=document.getElementsByName("selectComment");
    for(var i=0;i<select.length;i++){
        select[i].checked=true;
    }
}
function upFunction(){
    var li=document.createElement("li");
    li.setAttribute("id","rright");
    li.innerHTML=document.getElementById("text").value+" @#";
    var ul=document.getElementById("list");
    ul.appendChild(li);

}
function lookFunction(){
    document.getElementById("edit").style="display:' '";
}
var w;
function oneFunction(){
    w=window.open('send.html','', 'width=460,height=500');
    w.focus();
}
/*
 * 个人信息界面
 * 修改信息
 * */
function makesure(){
    var email=document.getElementById("emails").value;
    if(!(/^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$ /.test(email))){
        alert("请填写正确的邮箱");
        return false;
    }else{
        if(!confirm("确认提交修改后的个人信息")){
            window.event.returnValue = false;
        }
        return true;
    }

}
function show() {
    var ig=document.getElementById("imgs");
    ig.style="display:' '";
    
    
}
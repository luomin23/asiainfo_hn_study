<%@ page import="com.asiainfo.chapter1.zhangyang.week7_day_03.entity.Person" %><%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2017/8/18
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        body {
            background-color: #3CA3DD;
            font: 30px "Arial", "Microsoft YaHei";
            color: #333;
        }
        ul,li{
            list-style: none;
            margin: 0px;
            padding: 0px;
        }

        a {
            text-decoration: none;
            color: #333;
        }
        header,section {
            width: 1060px;
            margin: 0px auto;
            overflow: hidden;
        }

        header {
            margin-top: 70px;
            height: 200px;
            font-size: 30px;
            font-family: "Times New Roman";
            text-align: center;
            line-height: 200px;
        }
        section {
            padding: 20px 0px;
        }

        aside {
            width: 200px;
            background-color: #fff;
            border-radius: 5px;
            float: left;
        }
        header {
            background-color:#00CCCC ;
        }
        #aside1 {
            padding: 2px;
        }

        #aside1 li {
            border-bottom: 10px solid #f2f2f5;
        }

        #aside1 li a {
            display: block;
            padding: 12px 16px;
            font-size: 18px;
            padding-left: 50px;
        }

        #aside1 li a:hover {
            background-color: #f2f2f5;
        }

        #aside1 li a  {
            padding-left: 5px;
        }

        aside a:hover
        {
            color:#6c6351;
        }
    </style>
</head>
<body>
    <a>欢迎来到学生管理系统！！！</a>
   <header>
       <%
           Person person = (Person)request.getSession().getAttribute("person");
           String name=person.getUserName();
       %>
     用户：<%=name%>&nbsp;登陆成功！
   </header>
   <section>
       <aside>
           <!-- 侧边栏 -->
           <ul id="aside1">
               <li><a href="/chapter1/zhangyang/week7_day_03/addStudent.jsp"> <span>添加学生信息</span></a></li>
               <li><a href="/chapter1/zhangyang/week7_day_03/queryStudent.jsp"> <span>删除学生信息</span></a></li>
               <li><a href="/chapter1/zhangyang/week7_day_03/queryStudent.jsp"> <span>修改学生信息</span></a></li>
               <li><a href="/chapter1/zhangyang/week7_day_03/queryStudent.jsp"> <span>查询学生信息</span></a></li>
               <li><a href="/chapter1/zhangyang/week7_day_03/upLoad.jsp"> <span>上传个人图片</span></a></li>
           </ul>
       </aside>
   </section>
</body>
</html>

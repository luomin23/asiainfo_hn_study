<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/8/15
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%! int day = 3;%>
<html>
<head>
    <meta charset="utf-8">
    <title>switch case语句</title>
</head>
<body>
<h3>SWITCH...CASE实例</h3>
<%
    switch(day){
        case 0:
            out.println("星期天");
            break;
        case 1:
            out.println("星期一");
            break;
        case 2:
            out.println("星期二");
            break;
        case 3:
            out.println("星期三");
            break;
        case 4:
            out.println("星期四");
            break;
        case 5:
            out.println("星期五2");
            break;
        default:
            out.println("星期六");
    }
 %>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/16 0016
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" chaarset="UTF-8">

    <base href="<%=basePath%>">

    <title>My JSP 'session.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" type="text/css" href="css/style.css">

</head>

<body>
<%
    String name = request.getParameter("name");		//获取用户填写的用户名

    session.setAttribute("name",name);				//将用户名保存在session对象中
%>
<div align="center">
    <form id="form1" name="form1" method="post" action="/chapter1/dongwenchao/web/day1/result.jsp">
        <table width="28%" border="0">
            <tr>
                <td>您的名字是：</td>
                <td><%=new String(request.getParameter("name").getBytes("ISO-8859-1"),"UTF-8")%></td>
            </tr>
            <tr>
                <td>您最喜欢去的地方是：</td>
                <td><label>
                    <input type="text" name="address" />
                </label></td>
            </tr>
            <tr>
                <td colspan="2"><label>
                    <div align="center">
                        <input type="submit" name="Submit" value="提交" />
                    </div>
                </label></td>
            </tr>
        </table>
    </form>
    <p>&nbsp;</p>
</div>
</body>
</html>


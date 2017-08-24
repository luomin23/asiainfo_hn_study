<%@ page import="java.util.Vector" %>
<%@ page import="com.asiainfo.chapter1.dongwenchao.web.day2.UserInfoList" %>
<%@ page import="com.asiainfo.chapter1.dongwenchao.web.day2.UserInfoTrace" %><%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/17 0017
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    UserInfoList list=UserInfoList.getInstance();
    UserInfoTrace ut=new UserInfoTrace();
    String name=request.getParameter("user");
    ut.setUser(name);
    session.setAttribute("list",ut);
    list.addUserInfo(ut.getUser());
    session.setMaxInactiveInterval(10);
%>
<body>
<div align="center">


    <table width="506" height="246" border="0" cellpadding="0" cellspacing="0" background="image/background2.jpg">
        <tr>
            <td align="center"><br>

 <textarea rows="8" cols="20">
<%
    Vector vector=list.getList();
    if(vector!=null&&vector.size()>0){
        for(int i=0;i<vector.size();i++){
            out.println(vector.elementAt(i));
        }
    }
%>
</textarea><br><br>
                <a href="loginOut.jsp">返回</a>

            </td>
        </tr>
    </table>
</div>
</body>
</html>

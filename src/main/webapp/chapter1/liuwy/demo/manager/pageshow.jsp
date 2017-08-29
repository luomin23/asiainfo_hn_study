<%@ page import="com.asiainfo.chapter1.liuwy.demo.PageVO" %>
<%@ page import="com.asiainfo.chapter1.liuwy.demo.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.asiainfo.chapter1.liuwy.August02.Goods" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2017/8/24
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2">
    <tbody>
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>地址</td>
        <td>邮箱</td>
    </tr>
    <%
        PageVO<User> pageVO=(PageVO<User>) request.getAttribute("pageVO");
        List<User> userList=pageVO.getListOfPage();
        for (User users:userList){
    %>
    <tr>
        <td><%=users.getId()%></td>
        <td><%=users.getName()%></td>
        <td><%=users.getAge()%></td>
        <td><%=users.getAddress()%></td>
        <td><%=users.getEmil()%></td>

    </tr><%
    }
%></tbody>
    <tfoot>
    <tr>
        <td colspan="5" align="right">
            <%if(pageVO.getPage()==1){%>
            上一页
            <%}else {%>
            <a href="/findpageservlet.do?pages=<%=pageVO.getPage()-1%>" >上一页</a>
            <%}%>

            &nbsp;|

            <%for (int i=1;i<=pageVO.getPageCout();i++){%>&nbsp;
            <%if (i==pageVO.getPage()){%>
            <%=i%><%}else {%>
            <a href="/findpageservlet.do?pages=<%=i%>" ><%=i%></a><%}%>&nbsp;<%}%>

            |&nbsp;
            <%if(pageVO.getPage()==pageVO.getPageCout()){%>
            下一页
            <%}else {%>
            <a href="/findpageservlet.do?pages=<%=pageVO.getPage()+1%>" >下一页</a>
            <%}%>
        </td>
    </tr>
    </tfoot>
</table><br>
<button onclick="history.back()">返回</button>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2017/8/18
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
    <%--<script>--%>
        <%--function update() {--%>
            <%--var  name =request.getAttribute("name");--%>
            <%--var  phone =request.getAttribute("phone");--%>
            <%--var  address =request.getAttribute("address");--%>
            <%--var  emil =request.getAttribute("emil");--%>
            <%--var  age =request.getAttribute("age");--%>
            <%--var url = "chapter1/liuwy/August21/update.jsp?name="+name+"&phone="+phone+"&address="+address+"&emil="+emil+"&age="+age;--%>
            <%--url=encodeURI(url);--%>
            <%--url=encodeURI(url);--%>
            <%--window.location.href =url;--%>
        <%--}--%>
    <%--</script>--%>


</head>
<body>
<table border="2">
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>地址</td>
        <td>邮箱</td>

    </tr>
    <tr><%
        int id=(Integer) request.getAttribute("id");
        String name=(String) request.getAttribute("name");
        int age=(Integer) request.getAttribute("age");
        String  address=(String ) request.getAttribute("address");
        String emil=(String) request.getAttribute("emil");
        %>

        <td><%=id%></td>
        <td><%=name%></td>
        <td><%=age%></td>
        <td><%=address%></td>
        <td><%=emil%></td>

    </tr>
    <tr>

        <td colspan="5">
            <%int user=(Integer)session.getAttribute("admin");
                if(user==1){%>
            <input type="button" name="delete" value="删除" onclick="window.location.href ='deleteservlet.do?id=<%=id%>';"><%}else {%>
            <input type="button" name="update" value="修改"
                   onclick="window.location.href ='/asiainfo_hn_study/chapter1/liuwy/demo/update.jsp?id=<%=id%>&name=<%=name%>&age=<%=age%>&address=<%=address%>&emil=<%=emil%>'">
            <%}%>
        </td>
    </tr>
</table><br>
<button onclick="history.back()">返回</button>
</body>
</html>

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
        <td>手机号</td>
        <td>地址</td>
        <td>邮箱</td>
        <td>年龄</td>
    </tr>
    <tr><%
        int id=(Integer) request.getAttribute("id");
        String name=(String) request.getAttribute("name");
        int phone=(Integer) request.getAttribute("phone");
        String  address=(String ) request.getAttribute("address");
        String emil=(String) request.getAttribute("emil");
        int age=(Integer) request.getAttribute("age");%>

        <td><%=id%></td>
        <td><%=name%></td>
        <td><%=phone%></td>
        <td><%=address%></td>
        <td><%=emil%></td>
        <td><%=age%></td>
    </tr>
    <tr>

        <td colspan="6">
            <input type="button" name="delete" value="删除" onclick="window.location.href ='deleteservlet.do?id=<%=id%>';alert('删除成功！')">
            <input type="button" name="update" value="修改"
                   onclick="window.location.href ='chapter1/liuwy/August21/update.jsp?id=<%=id%>&name=<%=name%>&phone=<%=phone%>&address=<%=address%>&emil=<%=emil%>&age=<%=age%>'">
        </td>
    </tr>
</table>
</body>
</html>

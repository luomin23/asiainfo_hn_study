<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <title>the first jsp</title>
</head>
<body>
    <%
        out.println("First Hello World！");
        String path="Test.jsp";
    %>
    <a href="<%=path%>" >动态链接地址：</a>
    <form action="../../../TestJsp" method="post">
        <table border="1">
            账户:<input type="text" name="name" /><br />
            密码:<input type="password" name="pwd" />
           <input type="submit" value="form+submit跳转" />
        </table>

    </form>



</body>
</html>

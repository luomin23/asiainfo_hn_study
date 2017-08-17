<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>跳转</title>
</head>
<body>
    <p>Test界面</p>
    <% for(int i=1;i<5;i++){ %>
        file<%=i%>:<input type="text" value="file<%=i%>" />
        <br /><br />
    <% } %>
    <hr />



</body>
</html>

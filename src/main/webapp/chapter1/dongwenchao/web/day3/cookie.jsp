<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/18 0018
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试cookie</title>
</head>
<body>
<%
/*Cookie cookie=new Cookie("name","123");
    response.addCookie(cookie);*/
    Cookie[] cookies=request.getCookies();
    if (cookies !=null && cookies.length>0) {
        for (Cookie cookie : cookies) {
            //获取cookie
            out.print(cookie.getName() + ":" + cookie.getValue());
        }
    }else {
        out.print("没有一个cookie正在创建并保存");
        //创建cooike
        Cookie cookie=new Cookie("name","234");
        cookie.setMaxAge(30 );
        //返回客户端
        response.addCookie(cookie);
    }
%>
${cookie.name.value}
</body>
</html>

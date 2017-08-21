<%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/18 0018
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String name=request.getParameter("name");
    if (name != null && !name.trim().equals("")){
        Cookie cookie=new Cookie("name",name);
        cookie.setMaxAge(30);
        response.addCookie(cookie);
    }else {
        Cookie[] cookies=request.getCookies();
        if (cookies!=null&&cookies.length>0) {
            for (Cookie cookie:cookies){
                String cookieName=cookie.getName();
                if ("name".equals(cookieName)){
                    String val=cookie.getValue();
                    name=val;
                }
            }
        }
    }
    if (name !=null&& !name.trim().equals("")){
        out.print("hello"+name);
    }else {
        response.sendRedirect("login.jsp");
    }
%>
</body>

</html>

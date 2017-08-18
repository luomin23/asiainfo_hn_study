<%--
  Created by IntelliJ IDEA.
  User: wjz123456
  Date: 2017/8/15
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="utf-8"
    >
    <title>Cookie 的使用</title>
</head>
<body>
<%
    Cookie name=new Cookie("name","www");
    response.addCookie(name);//创建一个cookie
    Cookie[] cookies=request.getCookies();//获取一个cookie
    if(cookies!=null&&cookies.length>1){
        for(Cookie cookie:cookies){
            out.println(cookie.getName()+" "+cookie.getValue());
            out.println("path"+cookie.getPath());
           // cookie.setMaxAge(30);//set cookie 的最大时效，若为0，则立即删除cookie，
                                                         // 若为-1表示不存储该cookie
        }
    }

%>
</body>
</html>
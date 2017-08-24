<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/8/16
  Time: 16:03
  To change this template use File | Settings | File Templates.
  用户成功登录后的主页
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>我的主页</title>
    </head>
    <body>
            <%String username=(String)request.getSession().getAttribute("username");
                if(username==null||username.equals("")){
                    request.setAttribute("loginResult","请先登录！");
                    request.getRequestDispatcher("/toLoginDemo.do").forward(request,response);
                }else {%>
                    欢迎:<%=request.getSession().getAttribute("username")%>
                    <a href="/toUpdateUserJsp.do">修改密码</a>
                    <a href="/toLoginDemo.do">注销</a><br>
                    <a href="/getAllBlogsByUsername.do">我的博客</a>
                    <a href="/toAddBlogJsp.do">发表博客</a>
                <%}
            %>
    </body>
</html>
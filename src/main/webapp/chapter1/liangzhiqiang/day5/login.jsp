<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/17
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; pageEncodingt=UTF-8"
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>登录页面</title>
</head>
<body>
 <form action="loginCheck.jsp">
     <table>
         <tr>
             <td>输入用户名：</td>
             <td><input type="text" name="name" size="16"
              value=<%=request.getParameter("name")%>>

             </td>
         </tr>
         <tr>
             <td>输入密码：</td>
             <td>
                 <input type="password" name="password" size="18">
             </td>

         </tr>
         <tr>
         <td><input type="submit" value="登录"></td>
         </tr>
     </table>
 </form>
</body>
</html>

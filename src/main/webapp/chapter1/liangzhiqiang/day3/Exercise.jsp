<%--
  Created by IntelliJ IDEA.
  User: 君不悔
  Date: 2017/8/14
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEncoding=UTF-8"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!//返回九九乘法表对应的HTML代码 通过表达式来调用，在页面上显示
    String printMultiTable()
    {
        String s="";
        for (int i=1;i<9;i++)
        {
            for (int j=1;j<=i;j++)
            {
                s+="*"+j+"="+(i*j)+"&nbsp;&nbsp;&nbsp;&nbsp";
        }

        s+="<br>";
    }
    return s;
    }
%>
<h1>九九乘法表</h1>
<hr>
<%=printMultiTable()%>
</body>
</html>

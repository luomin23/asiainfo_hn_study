<%--
  Created by IntelliJ IDEA.
  User: ������
  Date: 2017/8/10
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;pageEnconding=UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type"content="text/html;charset=UTF-8">

    <title>jspҳ��Ļ����ṹʵ��</title>
</head>
<body>
    <%!int sum=0;
    int x=1;
    %>
    <%
    while (x<=10)
    {
    sum+=x;
    ++x;
    }
    %>
<p>1�ӵ�10�Ľ����:<%=sum%></p>
<p>���ڵ�ʱ����:<%=new java.util.Date()%></p>
      </body>
        </html>
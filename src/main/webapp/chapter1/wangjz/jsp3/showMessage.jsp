<%--
  Created by IntelliJ IDEA.
  User: wjz123456
  Date: 2017/8/18
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.asiainfo.chapter1.wangjz.java.javaday1.Servlet2.MessageBean" %>
<%@ page import="java.util.ArrayList"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="utf-8">
    <title>留言板内容</title>
</head>
<body>
<%
    ArrayList wordlist=(ArrayList)application.getAttribute("wordlist");
    if(wordlist==null||wordlist.size()==0)
        out.print("没有留言");
    else{
        System.out.println(wordlist.isEmpty());
        for(int i=wordlist.size()-1;i>=0;i--){
       MessageBean mm=(MessageBean)wordlist.get(i);
%>
留言者：<%=mm.getAuthor()%>
<p>
    留言时间：<%=mm.getTime()%>
</p>
<p>
   留言标题 <%=mm.getTitle()%>
</p>
<p>
    留言内容:<textarea rows="8" cols="30" readonly
>
<%=mm.getContent()%></textarea><</p>
        }
<a href="messageBorder.jsp">我要留言</a>
<hr width="90%">
<%
    }}

%>
</body>
</html>

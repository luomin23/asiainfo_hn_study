<%@ page import="java.util.ArrayList" %>
<%@ page import="com.asiainfo.chapter1.luhui.luhui13.MessageBean" %>
<%--
  Created by IntelliJ IDEA.
  User: 18237161432
  Date: 2017/8/18
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>显示留言内容</title>
</head>
<body background="chapter1/luhui/html1/web/07.jpg">
<%
    ArrayList wordlist =(ArrayList)application.getAttribute("wordlist");
    if(wordlist==null||wordlist.size()==0)
        out.print("没有留言可显示");
    else{
        for(int i=wordlist.size()-1;i>=0;i--) {
            MessageBean mm = (MessageBean)wordlist.get(i);
%>
留言者：<%=mm.getAuthor()%>
<p>留言时间：<%=mm.getTime()%>
<p>留言标题：<%=mm.getTitle()%>
<p>
    留言内容：
    <textarea rows="8" cols="30" readonly>
        <%=mm.getContent()%>
    </textarea>
</p>
<a href="messageBoard.jsp">我要留言</a>

<%
        }
    }
%>
</body>
</html>

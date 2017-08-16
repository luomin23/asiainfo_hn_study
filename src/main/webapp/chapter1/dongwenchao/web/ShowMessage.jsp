<%@ page import="java.util.ArrayList" %>
<%@ page import="com.asiainfo.chapter1.dongwenchao.web.MessageBean" %><%--
  Created by IntelliJ IDEA.
  User: 超超
  Date: 2017/8/15 0015
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示留言内容</title>
</head>
<body>
<%
    ArrayList wordlist=(ArrayList)application.getAttribute("wordlist");
    if (wordlist==null||wordlist.size()==0)
        out.print("没有留言可显示");
    else {
        for (int i=wordlist.size()-1;i>=0;i--){
            MessageBean mm=(MessageBean)wordlist.get(i);
            %>
留言者：<%=mm.getAuthor()%>
<p>留言时间：<%=mm.getTime()%></p>
<p>留言标题：<%=mm.getTitle()%></p>
<p>
    留言内容：
    <textarea rows="8" cols="30" readonly>
        <%=mm.getContent()%>
        </textarea>
</p>
<a href="messageBoard.jsp">我要留言</a>
<hr width="90%">
<%
        }
    }
%>
</body>
</html>

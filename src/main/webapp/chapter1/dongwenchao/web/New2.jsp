<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <meta http-equiv="CONTENT-TYPE"content="text/html;charset=UTF-8">
    <title>the first jsp</title>
</head>
<body>
<%
String strText,strche1,strche2;
    String strOut;
/*
    strText=request.getParameter("text");
*/
     strText=new String(request.getParameter("text").getBytes("ISO-8859-1"),"UTF-8");//处理乱码问题
    strche1=request.getParameter("ch1");
    strche2=request.getParameter("ch2");
    if (strche1==null){
        strche1="没有被选中";
    }else {
        strche1="被选中";
    }
    if (strche2==null){
        strche2="没有被选中";
    }else {
        strche2="被选中";
    }
    strOut="文本的内容是:"+strText;
    strOut+="复选框1"+strche1;
    strOut+="复选框2"+strche2;
    out.print(strOut);
%>
</body>
</html>

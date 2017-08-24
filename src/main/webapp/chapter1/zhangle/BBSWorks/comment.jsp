<%--
  Created by IntelliJ IDEA.
  User: del
  Date: 2017/8/24
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>话题查询</title>
    <style>
        td{
            text-align: center;
        }
    </style>
</head>
<body>
<div>
    用户名:<input type="text" name="teles" /><span>11位手机号</span><br />
    <form action="/zl/pagings">
        <table  cellpadding="0" cellspacing="0"  border="1" width="200px" height="200px">
            <thead>
            <tr>
                <th>评论</th>
                <th>操作</th>
            </tr>
            </thead>
            <c:forEach var="comment" items="${requestScope.comment}">
                <tr>
                    <td>${comment.comments}</td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="2">
                   页数:<input type="text" name="num" /><input type="submit" value="GO"/>
                </td>
            </tr>
        </table>
    </form>

</div>


</body>
</html>

<%@ page import="com.asiainfo.chapter1.zhangle.BBSWorks.Entity.PageInfo" %><%--
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
            text-align:center;
        }
        span{
            padding:8px;

        }
        a{
            text-decoration: none;
            color: blue;
        }
        div{
            margin-top: 60px;
            margin-left: 30px;
        }
        label{
            width:50px ;
            margin-left: 30px;
        }
    </style>
</head>
<body>
    <br />
    <div>
        <form action="/zl/commentDeleteAll" method="post">
            <table  cellpadding="0" cellspacing="0"  border="1" width="400px">
                <thead>
                    <tr>
                        <th>
                            全选<input type="checkbox" id="checkall" name="checkall" onclick="checkAll()" /><br>
                            <input type="submit" value="删除"  onclick="return confirm('确定删除吗？')" align="left">
                        </th>
                        <th>编号</th>
                        <th>评论</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <c:forEach var="comment" items="${requestScope.pageInfo.comment}">
                    <tr>
                        <td>
                            <input type="checkbox" id='${comment.id}' name='selectComment' value= '${comment.id}' />
                        </td>
                        <td>${comment.id}</td>
                        <td>${comment.comments}</td>
                        <td><a href= "/zl/deletecomment?commentId=${comment.id}" onclick="deleteOne(${comment.id})">删除</a></td>
                    </tr>
                </c:forEach>

                <tr>
                    <td colspan="4">

                        <span>共${requestScope.pageInfo.pages}页:</span>
                        <span>${requestScope.pageInfo.page}/${requestScope.pageInfo.pages}</span>
                        <span><a href="/zl/pagings?page=1">首页</a> </span>
                        <span><a href="/zl/pagings?page=${requestScope.pageInfo.page-1}">上一页</a></span>
                        <span><a href="/zl/pagings?page=${requestScope.pageInfo.page+1}">下一页</a></span>
                        <span><a href="/zl/pagings?page=${requestScope.pageInfo.pages}">尾页</a></span>

                    </td>
                </tr>
            </table>
        </form>
        <form action="/zl/commentDeleteAll" method="post">
            <table cellpadding="0" cellspacing="0"  border="1" width="400px">
                <tr>
                    <td>
                        <input type="text" name="selectpageone" /><input type="submit" value="GO"/>

                    </td>
                </tr>
            </table>
        </form>


</div>

<script>
    function checkAll() {
        var checkall=document.getElementById("checkall");
        var select=document.getElementsByName("selectComment");
        if(checkall.checked==true){
            for(var i=0;i<select.length;i++){
                select[i].checked=true;
            }
        }else{
            for(var i=0;i<select.length;i++) {
                select[i].checked = false;
            }
        }
    }
</script>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: del
  Date: 2017/8/15
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" pageEncoding="GBK" %>
<html>
<head>
    <title>get</title>
</head>
<body>
    <h2>�����ѡ�и�ѡ��ʹ��getParameterValues()���������500����</h2>
    <form action="/zl/get" method="get">
    <table>
        <tr>
            <td>����:</td>
            <td><input type="text" name="name" value="����" /></td>
        </tr>
        <tr>
            <td>����:</td>
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
            <td rowspan="3" align="top">����:</td>
            <td><input type="checkbox" name="check"  />����</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="check" />д��</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="check" />������</td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="�ύ" /></td>
        </tr>
    </table>


    </form>
</body>
</html>

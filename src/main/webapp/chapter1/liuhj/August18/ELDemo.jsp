
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.asiainfo.chapter1.liuhj.August18.Person" %><%--
  Created by IntelliJ IDEA.
  User: 刘豪杰
  Date: 2017/8/18
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<!--
  获取相对路径的EL表达式
-->
<img src="${pageContext.request.contextPath}/1.jbg">


<head>
    <title>EL表达式的使用方法</title>
</head>
<body>
<h1>获取javabean的属性</h1>
<%
      Person p =new Person();
      p.setName("哈士奇");
      p.setAge(2);
      pageContext.setAttribute("p",p);
%>
${p.name}  ${p.age}


      <h1>获取Map中的数据</h1><hr>
      <%
          Map<String,String> map =new HashMap<String, String>();
          map.put("name","刘豪杰");
          map.put("age","17");
          map.put("gender","男");
          map.put("school","郑轻");
          pageContext.setAttribute("map",map);
      %>
      ${map["name"]}   ${map["addr"]}
      ${map.gender}    ${map["school"]}

       <h1>获取集合中的数据</h1><hr>
    <%
        List<String> list = new ArrayList<String>();
        list.add("河南农大");
        list.add("郑州轻工业大学");
        list.add("中原工学院");
        list.add("黄河科技学院");
        pageContext.setAttribute("list",list);
    %>
       ${list[2]}
         <h1>获取数组数据</h1><hr>
         <%
             String[] names ={"猫","狗","狮子","大象"};
             pageContext.setAttribute("names",names);
         %>
         ${names[2]}
     <!--EL表达式不能遍历数组中的元素
     -->


         <h1>获取域中的变量数据</h1><hr>
     <%
             String name ="刘豪杰";
             pageContext.setAttribute("name",name);
     %>
         ${name}
         <h1>获取常量数据</h1><hr>
          ${"获取常量数据"}    ${199}  ${true}

</body>
</html>

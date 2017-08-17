package com.asiainfo.chapter1.liuhj.August16.Request;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
* 接受表单提交的请求参数
*如果不指定码表服务器会默认使用ISO8859-1
* */

public class ParamServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //此行代码只对POST有效果，因为GET提交参数实在请求头中。 这个是设置请求体的
        request.setCharacterEncoding("utf-8");
        String  username = request.getParameter("username");
        System.out.println(username);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


               String  username = request.getParameter("username");
               username = new String(username.getBytes("iso8859-1"),"utf-8");
               System.out.println(username);
           //   获取枚举对象
           //    Enumeration enumeration =request.getParameterNames();
             //    while (enumeration.hasMoreElements()){
               //  String name = (String) enumeration.nextElement();
               //  String value = request.getParameter(name);
               //      System.out.println(name+":"+value);
        }
    }


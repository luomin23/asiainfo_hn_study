package com.asiainfo.chapter1.liuhj.August14;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
/*
*
*       获取Web应用的初始化信息（已经把配置信息放到了配置文件中了）
*
* */


@WebServlet(name = "ContextServlet")
public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context  =this.getServletContext();
        Enumeration enumeration =context.getInitParameterNames();
        while (enumeration.hasMoreElements()){
            String name =(String)enumeration.nextElement();
            String value=context.getInitParameter(name);
            System.out.println(name+":"+value);
        }

    }
}

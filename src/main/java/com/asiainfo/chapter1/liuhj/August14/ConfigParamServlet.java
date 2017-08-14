package com.asiainfo.chapter1.liuhj.August14;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


/*
*  用处：如果编码每天工程用的编码表可能不一样，可以在配置文件中配置多个编码表。这样如果说
*        换编码通过修改配置文件的方法就可以了，不用写死程序。
*
*                                                                                （ javaweb  day03 ）
 */



@WebServlet(name = "ConfigParamServlet")
public class ConfigParamServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig config =this.getServletConfig();
        // 获取当前Servlet中配置的初始化参数并打印在控制台上
       //  String value =config.getInitParameter("name2");
        //System.out.println(value);
        // 获取所有名字组成的枚举
        Enumeration enumeration =config.getInitParameterNames();
        //遍历枚举
        while (enumeration.hasMoreElements()){
             String name =(String) enumeration.nextElement();
             String value=config.getInitParameter(name);
            System.out.println(name+":"+value);



        }
        //用法如果编码每天工程用的编码表可能不一样


    }
}

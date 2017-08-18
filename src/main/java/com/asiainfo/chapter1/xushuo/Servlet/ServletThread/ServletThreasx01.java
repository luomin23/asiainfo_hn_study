package com.asiainfo.chapter1.xushuo.Servlet.ServletThread;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by root on 2017/8/17.
 * 线程安全
 */
public class ServletThreasx01 extends HttpServlet {
    //int i = 0;
    //有线程安全问题
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //int i = 0;
        //无线程安全问题
//        i++;
//        System.out.println(i);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

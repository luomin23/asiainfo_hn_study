package com.asiainfo.chapter1.xushuo.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by root on 2017/8/14.
 */
public class LoginServletDemo01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String userName = req.getParameter("uname");
        String password = req.getParameter("upwd");

        System.out.println("用户名 ==》" +userName);
        System.out.println("密 码 ==》"+ password);
    }
}
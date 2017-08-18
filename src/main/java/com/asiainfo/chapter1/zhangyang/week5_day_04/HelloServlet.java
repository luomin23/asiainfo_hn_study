package com.asiainfo.chapter1.zhangyang.week5_day_04;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by 11 on 2017/8/10.
 */
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("gbk");//处理请求与响应中文字体乱码，只适用于post提交
        response.setCharacterEncoding("gbk");//设置编码一定放在程序的最前面
        PrintWriter out = response.getWriter();//使用该方法写入网络中
        out.println("Hello,UserServlet");
        out.println("my locahost Ip："+request.getRemoteAddr()+","+new Date());
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

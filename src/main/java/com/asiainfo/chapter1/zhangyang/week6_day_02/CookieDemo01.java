package com.asiainfo.chapter1.zhangyang.week6_day_02;

import com.asiainfo.chapter1.fengzx.Aug02.Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by 11 on 2017/8/15.
 */
@WebServlet(name = "Servlet2")
public class CookieDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("你上次访问的时间是：");
        //获取用户时间的cookie
        Cookie cookies[] = request.getCookies();
        for (int i = 0;cookies!=null && i <cookies.length ; i++) {
            if (cookies[i].getName().equals("LastAccessTime")){
                long cookievalue = Long.parseLong(cookies[i].getValue());
                Date d = new Date(cookievalue);
                out.println(d.toLocaleString());
            }
        }
        Cookie c = new Cookie("LastAccessTime",System.currentTimeMillis()+"");
        c.setMaxAge(1*7*24*3600);
        response.addCookie(c );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

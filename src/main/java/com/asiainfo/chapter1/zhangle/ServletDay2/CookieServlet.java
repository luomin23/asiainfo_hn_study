package com.asiainfo.chapter1.zhangle.ServletDay2;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by del on 2017/8/16.
 */
public class CookieServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie cookie=new Cookie("Sname","name");  //cookie的键 值
        cookie.setMaxAge(60*1);  //设置cookie的存活时间（秒）60秒
        response.addCookie(cookie);  //为响应添加cookie
        Cookie cookie1=new Cookie("Scheck","check");
        cookie1.setMaxAge(20);
        response.addCookie(cookie1);
        PrintWriter pw=response.getWriter();
        String name=request.getParameter("name");
        pw.println("账号:"+name);
        System.out.println("Cookie调用");
        Cookie[] c=request.getCookies();
        for(Cookie cc:c){
            cc.getName();
            cc.getValue();
            pw.println("cookie.name="+cc.getName());
            pw.println(",cookie.value="+cc.getValue());
        }




    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        doGet(request,response);
    }
}

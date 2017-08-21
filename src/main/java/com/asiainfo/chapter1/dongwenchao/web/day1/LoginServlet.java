package com.asiainfo.chapter1.dongwenchao.web.day1;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Created by 超超 on 2017/8/16 0016.
 */
public class LoginServlet extends HttpServlet  {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String savetime=request.getParameter("saveTime");
        System.out.println("usrename  "+username+"  password "+password);
        if(CheckLogin.login(username, password)){
            if(null!=savetime){
                int saveTime=Integer.parseInt(savetime);//这里接受的表单值为天来计算的
                int seconds=saveTime*24*60*60;
                Cookie cookie = new Cookie("user", username+"=="+password);
                cookie.setMaxAge(seconds);
                response.addCookie(cookie);
            }
            request.setAttribute("username",username);
            request.getRequestDispatcher("/chapter1/dongwenchao/web/day1/main126.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("/chapter1/dongwenchao/web/day1/failure.jsp").forward(request,response);
        }
    }
}

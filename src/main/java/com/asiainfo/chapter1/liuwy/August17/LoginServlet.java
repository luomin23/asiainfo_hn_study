package com.asiainfo.chapter1.liuwy.August17;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LENOVO on 2017/8/17.
 */
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String[] isSave=req.getParameterValues("isSave");
        if (isSave!=null){
            Cookie cookie=new Cookie("username",username);
            cookie.setMaxAge(7*24*60*60);
            resp.addCookie(cookie);
        }

        String password=req.getParameter("password");
        if(username.equals(password)){
            resp.sendRedirect(req.getContextPath()+"/ok.jsp");

        }else {
            resp.sendRedirect(req.getContextPath()+"/Login.jsp");

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        this.doGet(req,resp);
    }
}

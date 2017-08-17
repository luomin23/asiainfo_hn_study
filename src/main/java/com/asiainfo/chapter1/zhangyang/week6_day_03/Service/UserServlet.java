package com.asiainfo.chapter1.zhangyang.week6_day_03.Service;

import com.asiainfo.chapter1.zhangyang.week6_day_03.DBUtil.UserService;
import com.asiainfo.chapter1.zhangyang.week6_day_03.Entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

/**
 * Created by 11 on 2017/8/16.
 */
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserService us = new UserService();
        User user = us.userLogin(username);
        HttpSession session = request.getSession();
        if (user !=null){
            if (user.getPassword().equals(password)){
                session.setAttribute("username",username);
                session.setAttribute("localDate",new Date());
                response.sendRedirect("/chapter1/zhangyang/week6_day_03/success.jsp");
            }else {
                session.setAttribute("str","密码错误！");
                response.sendRedirect("/chapter1/zhangyang/week6_day_03/error.jsp");
            }
        }else {
            session.setAttribute("str","用户名不存在！");
            response.sendRedirect("/chapter1/zhangyang/week6_day_03/error.jsp");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

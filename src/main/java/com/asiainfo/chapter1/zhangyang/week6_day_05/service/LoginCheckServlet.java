package com.asiainfo.chapter1.zhangyang.week6_day_05.service;

import com.asiainfo.chapter1.zhangyang.week6_day_03.Entity.User;
import com.asiainfo.chapter1.zhangyang.week6_day_05.dao.PersonDao;
import com.asiainfo.chapter1.zhangyang.week6_day_05.entity.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 11 on 2017/8/18.
 */

public class LoginCheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String userName = request.getParameter("username");
        String userPassword = request.getParameter("password");
        Person person = new Person();
        person.setUserName(userName);
        person.setUserPassword(userPassword);
        PersonDao dao = new PersonDao();
        if(dao.checkPerson(person)){
            request.getRequestDispatcher("/chapter1/zhangyang/week6_day_05/main.jsp").forward(request,response);
        }else {
            request.setAttribute("message", "用户名或密码错误");
            request.getRequestDispatcher("/chapter1/zhangyang/week6_day_05/login.jsp").forward(request, response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

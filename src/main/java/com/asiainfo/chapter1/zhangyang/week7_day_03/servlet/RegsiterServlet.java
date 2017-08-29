package com.asiainfo.chapter1.zhangyang.week7_day_03.servlet;

import com.asiainfo.chapter1.zhangyang.week7_day_03.daoimpl.PersonDaoimpl;
import com.asiainfo.chapter1.zhangyang.week7_day_03.entity.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 11 on 2017/8/18.
 */

public class RegsiterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        String userSex = request.getParameter("userSex");
        Person person = new Person();
        person.setUserName(userName);
        person.setUserPassword(userPassword);
        person.setUserSex(userSex);
       // PersonDao personDao = new PersonDao();
        PersonDaoimpl daoimpl = new PersonDaoimpl();
        daoimpl.insertUser(person);
        request.getRequestDispatcher("/chapter1/zhangyang/week7_day_03/login1.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

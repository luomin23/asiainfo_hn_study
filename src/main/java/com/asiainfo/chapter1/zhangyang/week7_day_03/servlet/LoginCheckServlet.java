package com.asiainfo.chapter1.zhangyang.week7_day_03.servlet;


import com.asiainfo.chapter1.zhangyang.week7_day_03.daoimpl.PersonDaoimpl;
import com.asiainfo.chapter1.zhangyang.week7_day_03.entity.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
        //PersonDao dao = new PersonDao();
        PersonDaoimpl daoimpl = new PersonDaoimpl();
        if(daoimpl.checkPerson(person)){
            HttpSession session = request.getSession();
            session.setAttribute("person",person);
            request.getRequestDispatcher("/chapter1/zhangyang/week7_day_03/main.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("/chapter1/zhangyang/week7_day_03/error.jsp").forward(request, response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

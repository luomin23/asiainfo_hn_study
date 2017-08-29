package com.asiainfo.chapter1.hanjunwen.webDemo.blog.controller.user;


import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.OperationUserDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.dao.impl.OperationUserDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ToGetUserByUsernameOrderUpdatePwdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        OperationUserDAO ou = new OperationUserDAOImpl();
//        System.out.println((String)request.getSession().getAttribute("username"));
        User u=ou.selectUserByUsername((String)request.getSession().getAttribute("username"));
        request.setAttribute("user",u);
        request.getRequestDispatcher("/toUpdateUserJsp.do").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

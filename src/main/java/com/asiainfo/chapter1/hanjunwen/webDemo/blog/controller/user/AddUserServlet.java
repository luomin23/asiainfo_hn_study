package com.asiainfo.chapter1.hanjunwen.webDemo.blog.controller.user;

import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.OperationUserDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.dao.impl.OperationUserDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String pwd=request.getParameter("passwd");
        String qq=request.getParameter("qq");
        User u=new  User();
        u.setUserName(username);
        u.setPwd(pwd);
        u.setQq(qq);
        OperationUserDAO oud = new OperationUserDAOImpl();
        if(oud.addUser(u)){
            String result="注册成功！";
            request.setAttribute("loginResult",result);
            request.getRequestDispatcher("/toLoginDemo").forward(request,response);
        }else {
            String result="注册失败！";
            request.setAttribute("loginResult",result);
            request.getRequestDispatcher("/toLoginDemo").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

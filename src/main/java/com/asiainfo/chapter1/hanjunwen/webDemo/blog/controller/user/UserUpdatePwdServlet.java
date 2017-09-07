package com.asiainfo.chapter1.hanjunwen.webDemo.blog.controller.user;

import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.OperationUserDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.dao.impl.OperationUserDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserUpdatePwdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        OperationUserDAO ou=new OperationUserDAOImpl();
        String pwd=request.getParameter("pwd");
        User u=new User();
        u.setUserName((String)request.getSession().getAttribute("username"));
        u.setPwd(pwd);
        if(ou.updateUserOfPwd(u)){
            request.setAttribute("result","更改成功！");
            request.setAttribute("pwd",pwd);
            request.getRequestDispatcher("toUpdateUserResult.do").forward(request,response);
        }else {
            request.setAttribute("result","更改失败！");
            request.getRequestDispatcher("toUpdateUserResult.do").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

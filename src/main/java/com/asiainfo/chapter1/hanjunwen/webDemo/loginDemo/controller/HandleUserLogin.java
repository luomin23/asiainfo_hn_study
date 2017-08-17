package com.asiainfo.chapter1.hanjunwen.webDemo.loginDemo.controller;


import com.asiainfo.chapter1.hanjunwen.webDemo.loginDemo.dao.OperationUser;
import com.asiainfo.chapter1.hanjunwen.webDemo.loginDemo.dao.dao.impl.OperationUserImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.loginDemo.entity.User;

import javax.servlet.http.HttpSession;
import java.io.IOException;

//对登录的用户进行判断
public class HandleUserLogin extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        OperationUser ou = new OperationUserImpl();
        User user=ou.selectUserByUsername(username);
//        if(username==null||username.equals("")){
//            response.sendRedirect("/toLoginDemo.do");
//        }else if(pwd==null||pwd.equals("")){
//            response.sendRedirect("/toLoginDemo.do");
//        }else
        if(user.getUserName()!=null&&!user.getUserName().equals("")){
            if(user.getPwd().equals(pwd)){
                HttpSession session=request.getSession();//将用户名密码存到会话的session中
                session.setAttribute("username",username);
                session.setAttribute("pwd",pwd);
                request.getRequestDispatcher("/userIndex.jsp").forward(request,response);
            }else {
                request.setAttribute("result","密码错误！");
//                response.sendRedirect("/toLoginDemo.do");
                request.getRequestDispatcher("/toLoginDemo.do").forward(request,response);
            }
        }else {
//                response.sendRedirect("/toLoginDemo.do");
            request.setAttribute("result","用户不存在！");
            request.getRequestDispatcher("/toLoginDemo.do").forward(request,response);
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}

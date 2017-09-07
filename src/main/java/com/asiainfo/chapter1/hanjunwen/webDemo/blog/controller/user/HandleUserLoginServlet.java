package com.asiainfo.chapter1.hanjunwen.webDemo.blog.controller.user;

import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.OperationUserDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.dao.impl.OperationUserDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.entity.User;

import javax.servlet.http.HttpSession;
import java.io.IOException;

//对登录的用户进行判断
public class HandleUserLoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        OperationUserDAO ou = new OperationUserDAOImpl();
        User user=new User();
        user.setUserName(username);
        user.setPwd(pwd);
        Boolean flag=ou.checkUser(user);
//        System.out.println(flag);
        HttpSession session=request.getSession();
        if(ou.checkUser(user)){
            //将用户的状态码存入session中，如果为true证明用户已经登录，如果为false则用户没有登录
            session.setAttribute("flag",flag);
            session.setAttribute("username",username);
            request.getRequestDispatcher("/toUserIndexWithPage?page=1").forward(request,response);
        }else {
            session.setAttribute("flag",flag);
            request.setAttribute("loginResult","用户名或密码错误！");
//            System.out.println(request.getAttribute("loginResult"));
            request.getRequestDispatcher("/toLoginDemo").forward(request,response);
        }
//        User user=ou.selectUserByUsername(username);
//        if(username==null||username.equals("")){
//            response.sendRedirect("/toLoginDemo.do");
//        }else if(pwd==null||pwd.equals("")){
//            response.sendRedirect("/toLoginDemo.do");
//        }else
//        if(user.getUserName()!=null&&!user.getUserName().equals("")){
//            if(user.getPwd().equals(pwd)){
//                HttpSession session=request.getSession();//将用户名密码存到会话的session中
//                session.setAttribute("username",username);
//                session.setAttribute("pwd",pwd);
//                request.getRequestDispatcher("/userIndex.jsp").forward(request,response);
//            }else {
//                request.setAttribute("result","密码错误！");
//                response.sendRedirect("/toLoginDemo.do");
//                request.getRequestDispatcher("/toLoginDemo.do").forward(request,response);
//            }
//        }else {
//                response.sendRedirect("/toLoginDemo.do");
//            request.setAttribute("result","用户不存在！");
//            request.getRequestDispatcher("/toLoginDemo.do").forward(request,response);
//        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}

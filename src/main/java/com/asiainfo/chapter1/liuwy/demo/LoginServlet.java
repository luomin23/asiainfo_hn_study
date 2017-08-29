package com.asiainfo.chapter1.liuwy.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by LENOVO on 2017/8/23.
 */
public class LoginServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dopost方法！");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
       // System.out.println(username+" "+password);
        UserBIZ userBIZ=new UserBIZ();
        User user=userBIZ.findByName(username);
        //System.out.println(user.getName()+" "+user.getPassword());
        String message="";
        if (username==null||username==""){
            message="请输入用户名！";
            req.setAttribute("message", message);
            req.getRequestDispatcher("chapter1//liuwy//demo//errmessage.jsp").forward(req, resp);
        }else if (password==null||password==""){
            message="请输入请输入密码！";
            req.setAttribute("message", message);
            req.getRequestDispatcher("chapter1//liuwy//demo//errmessage.jsp").forward(req, resp);
        }else {
            if ("liuwy".equals(username)&&"123".equals(password)){
                HttpSession session = req.getSession();
                session.setAttribute("admin",1);
                session.setAttribute("id", 1);
                session.setAttribute("username", "liuwy");
                resp.sendRedirect("chapter1//liuwy//demo//manager//success.jsp");
            }else {
            if (user == null) {
                message = "用户名不存在，登陆失败！";
                req.setAttribute("message", message);
                req.getRequestDispatcher("chapter1//liuwy//demo//errmessage.jsp").forward(req, resp);

            } else {
                if (user.getPassword().equals(password)) {
                    HttpSession session = req.getSession();
                    session.setAttribute("admin",2);
                    session.setAttribute("id", user.getId());
                    session.setAttribute("username", username);
                    resp.sendRedirect("chapter1//liuwy//demo//user//yes.jsp");
                } else {
                    message = "密码错误，登陆失败！";
                    req.setAttribute("message", message);
                    req.getRequestDispatcher("chapter1//liuwy//demo//errmessage.jsp").forward(req, resp);
                }
            }
            }
        }
    }
}

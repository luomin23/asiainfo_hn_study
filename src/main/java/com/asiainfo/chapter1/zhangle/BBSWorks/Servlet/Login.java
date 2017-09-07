package com.asiainfo.chapter1.zhangle.BBSWorks.Servlet;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.User;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.Implement.UserServiceImpl;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by del on 2017/8/18.
 */
public class Login extends HttpServlet {
    UserService us=new UserServiceImpl();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        String name=request.getParameter("loginName");
        String pwd=request.getParameter("loginPwd");
        User user=us.selectByTelephone(name);
        if(user!=null){
            //登录成功
                HttpSession session = request.getSession();
                session.setAttribute("loginFlag", "pass");
                String username=user.getTelephone();
                session.setAttribute("userInfo", username);
                System.out.println("用户名:"+ username);
                System.out.println("登录成功");
                request.getRequestDispatcher("../chapter1/zhangle/BBSWorks/Person.jsp").forward(request, response);

        }else {
            System.out.println("根据电话查询信息结果--信息不存在");
            out.print("<script language='javascript'>alert('你还未注册,请注册');window.location.href='../chapter1/zhangle/BBSWorks/Regist.jsp';</script>");

        }



    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);

    }
}

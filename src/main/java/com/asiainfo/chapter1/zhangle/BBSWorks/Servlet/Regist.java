package com.asiainfo.chapter1.zhangle.BBSWorks.Servlet;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.User;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.Implement.UserServiceImpl;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by del on 2017/8/21.
 */
public class Regist extends HttpServlet {
    UserService userService=new UserServiceImpl();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        String telephone=request.getParameter("telephone");
        String password=request.getParameter("pwd");
       /*
        先根据电话号码查询数据库中是否有此人
        * 有此人则返回 你已经注册过了
        * 否则将此电话号的信息添加至数据库
        * */
        User get=userService.selectByTelephone(telephone);
        if(get==null){
            User user= new User();
            user.setTelephone(telephone);
            user.setPassword(password);
            userService.insertUser(user);
            System.out.println("添加至数据库成功");
            request.getRequestDispatcher("../chapter1/zhangle/BBSWorks/IndexUser.jsp").forward(request,response);  //注册成功跳转至首页

        }else{
            System.out.println("根据电话查询信息结果--信息已存在");
            out.print("<script language='javascript'>alert('你已经注册过了,请登录');window.location.href='../chapter1/zhangle/BBSWorks/Index.jsp';</script>");

        }

    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);

    }
}

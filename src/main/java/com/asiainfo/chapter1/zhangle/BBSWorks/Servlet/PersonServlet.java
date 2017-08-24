package com.asiainfo.chapter1.zhangle.BBSWorks.Servlet;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.User;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.Implement.UserServiceImpl;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by del on 2017/8/22.
 */
public class PersonServlet extends HttpServlet {
    UserService us=new UserServiceImpl();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String tele=request.getParameter("tele");
        String name=request.getParameter("lastname");
        String email=request.getParameter("email");
        us.updateUser(name,email,tele);
        response.sendRedirect("../chapter1/zhangle/BBSWorks/IndexUser.jsp");



    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);

    }
}

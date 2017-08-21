package com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.controller.blog;


import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.OperationBlogDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.dao.impl.OperationBlogDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.Blog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GetAllBlogsByUsernameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        OperationBlogDAO obd =new OperationBlogDAOImpl();
        List<Blog> blogs=new ArrayList<Blog>();
        blogs=obd.selectBlogsByAuthor((String) request.getSession().getAttribute("username"));
        request.setAttribute("blogs",blogs);
        request.getRequestDispatcher("/toAllBlogsByUser.do").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

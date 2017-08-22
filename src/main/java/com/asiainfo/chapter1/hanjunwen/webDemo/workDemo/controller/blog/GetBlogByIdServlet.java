package com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.controller.blog;


import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.OperationBlogDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.dao.impl.OperationBlogDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.Blog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetBlogByIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        int id = Integer.parseInt(request.getParameter("id"));
        OperationBlogDAO obd = new OperationBlogDAOImpl();
        Blog blog=obd.getBlogById(id);
        request.setAttribute("blog",blog);
        request.getRequestDispatcher("/toUpdateBlogJSP.do").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

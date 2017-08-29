package com.asiainfo.chapter1.hanjunwen.webDemo.blog.controller.blog;



import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.OperationBlogDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.dao.impl.OperationBlogDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.entity.Blog;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.util.PageUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GetAllBlogsByUsernameWithPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        OperationBlogDAO obd =new OperationBlogDAOImpl();
        PageUtil pu = new PageUtil();
        List<Blog> blogs=new ArrayList<Blog>();
        String spage=request.getParameter("page");
        int page =Integer.parseInt(spage);
        String username= (String) request.getSession().getAttribute("username");
        pu=obd.selectBlogsWithPage(username,page);
        int rows=obd.selectBlogsGetRows(username);
        pu.setRows(rows);
        blogs=pu.getList();
        request.setAttribute("pu",pu);
        request.setAttribute("page",page);
        request.setAttribute("blogs",blogs);
        request.getRequestDispatcher("/toAllBlogsByUserWithPage.do").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

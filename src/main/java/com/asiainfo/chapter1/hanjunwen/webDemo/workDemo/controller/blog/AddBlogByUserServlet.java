package com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.controller.blog;

import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.OperationBlogDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.dao.impl.OperationBlogDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.Blog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddBlogByUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        Boolean result= false;
        OperationBlogDAO odb =new OperationBlogDAOImpl();
        String title = request.getParameter("title");
        String article = request.getParameter("article");
//        System.out.println(title);
//        System.out.println(article);
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setArticle(article);
        blog.setAuthor((String)request.getSession().getAttribute("username"));
        if(odb.addBlog(blog)){
            result=true;
//            System.out.println("=========");
            request.setAttribute("result",result);
            request.setAttribute("blog",blog);
            request.getRequestDispatcher("/toAddBlogByUserResult.do").forward(request,response);
        }else {
//            System.out.println("22222222222");
            request.setAttribute("result",result);
            request.getRequestDispatcher("/toAddBlogByUserResult.do").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

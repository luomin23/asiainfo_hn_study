package com.asiainfo.chapter1.hanjunwen.webDemo.blog.controller.blog;

import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.OperationBlogDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.dao.impl.OperationBlogDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class DeleteBlogByIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        OperationBlogDAO obd = new OperationBlogDAOImpl();
        String s=request.getParameter("id");
        int id=Integer.parseInt(s);
//        System.out.println(id);
        if(obd.deleteBlogById(id)){
            String result ="删除成功！";
            request.setAttribute("result",result);
            request.getRequestDispatcher("/getAllBlogsByUsernameWithPage.do?page=1").forward(request,response);
        }else {
            String result ="删除失败！";
            request.setAttribute("result",result);
            request.getRequestDispatcher("/getAllBlogsByUsernameWithPage.do?page=1").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

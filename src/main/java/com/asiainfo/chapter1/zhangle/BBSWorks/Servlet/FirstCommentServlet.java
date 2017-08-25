package com.asiainfo.chapter1.zhangle.BBSWorks.Servlet;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.PageInfo;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.CommentService;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.Implement.CommentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by del on 2017/8/23.
 */
public class FirstCommentServlet extends HttpServlet {
    CommentService cs=new CommentServiceImpl();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PageInfo pageInfo=cs.selectAllComment(2,4);
        System.out.println("结果："+pageInfo.getComment().toString());
        request.setAttribute("pageInfo",pageInfo);
        System.out.println("总页数"+pageInfo.getPages());
        System.out.println("dangq 页数"+pageInfo.getPage());
        request.getRequestDispatcher("../chapter1/zhangle/BBSWorks/comment.jsp").forward(request,response);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);

    }
}

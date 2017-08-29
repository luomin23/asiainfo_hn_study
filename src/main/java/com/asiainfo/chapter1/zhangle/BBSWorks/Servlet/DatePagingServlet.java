package com.asiainfo.chapter1.zhangle.BBSWorks.Servlet;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.Comment;
import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.PageInfo;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.CommentService;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.Implement.CommentServiceImpl;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.Implement.UserServiceImpl;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by del on 2017/8/24.
 */
public class DatePagingServlet extends HttpServlet{
    CommentService cs=new CommentServiceImpl();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out=response.getWriter();

        String s=request.getParameter("page");
        int page=Integer.valueOf(s).intValue();
        /*//第一种
        List<Comment> comment=cs.selectAllComment(page,4);
        request.setAttribute("comment", comment);
        //响应结果
        request.getRequestDispatcher("../chapter1/zhangle/BBSWorks/comment.jsp").forward(request,response);
        */
        //第二种

        PageInfo pageInfo=cs.selectAllComment(page,4);
       // pageInfo.setPage(page);  //page的值可以<=0  >页数
        request.setAttribute("pageInfo",pageInfo);
        System.out.println("总页数"+pageInfo.getPages());
        System.out.println("dangq 页数"+pageInfo.getPage());
        request.getRequestDispatcher("../chapter1/zhangle/BBSWorks/comment.jsp").forward(request,response);


    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);

    }
}

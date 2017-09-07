package com.asiainfo.chapter1.zhangle.BBSWorks.Servlet;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.PageInfo;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.CommentService;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.Implement.CommentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by del on 2017/8/29.
 */
public class InsertCommentServlet extends HttpServlet {
    CommentService cs=new CommentServiceImpl();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        HttpServletRequest res = (HttpServletRequest)request;
        HttpServletResponse resp = (HttpServletResponse)response;
        HttpSession session = res.getSession();
        String comment=request.getParameter("commentadd");
        String username=(String) res.getSession().getAttribute("userInfo");
        System.out.println("用户名:"+username);
        cs.insertComment(username,comment);
        request.getRequestDispatcher("../chapter1/zhangle/BBSWorks/IndexSchool.jsp").forward(request,response);


    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);

    }
}

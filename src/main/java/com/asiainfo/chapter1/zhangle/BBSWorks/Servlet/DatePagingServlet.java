package com.asiainfo.chapter1.zhangle.BBSWorks.Servlet;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.Comment;
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
        //out.print("<script language='javascript'>document.getElementById('pdiv').style='display:' '';</script>");
        //request.getRequestDispatcher("../chapter1/zhangle/BBSWorks/IndexSchool.jsp").forward(request,response);
        //String telep=request.getParameter("teles");
        String s=request.getParameter("num");
        int page=Integer.valueOf(s).intValue();
        List<Comment> comment=cs.selectAllComment(page);
        request.setAttribute("comment", comment);
        //响应结果
        request.getRequestDispatcher("../chapter1/zhangle/BBSWorks/comment.jsp").forward(request,response);


    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);

    }
}

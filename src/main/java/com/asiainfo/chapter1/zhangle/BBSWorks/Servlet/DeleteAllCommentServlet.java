package com.asiainfo.chapter1.zhangle.BBSWorks.Servlet;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.PageInfo;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.CommentService;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.Implement.CommentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by del on 2017/8/29.
 */
public class DeleteAllCommentServlet extends HttpServlet{
    CommentService cs=new CommentServiceImpl();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        String[] s=request.getParameterValues("selectComment");
        String input=request.getParameter("selectpageone");
        System.out.println("选择页码="+input);
        if(input==null) {
            System.out.println("批量删除");
            int[] id = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                id[i] = Integer.parseInt(s[i]);
                cs.deletComments(id[i]);
            }
        }else {
            System.out.println("根据页码查询");
            int page=Integer.valueOf(input).intValue();
            PageInfo pageInfo=cs.selectAllComment(page,4);
            request.setAttribute("pageInfo",pageInfo);
            System.out.println("总页数"+pageInfo.getPages());
            System.out.println("dangq 页数"+pageInfo.getPage());
            /*if(page<1) {
                out.print("<script language='javascript'>alert('你想查找的应该是首页吧');window.location.href='../chapter1/zhangle/BBSWorks/comment.jsp';</script>");
            }else {
                out.print("<script language='javascript'>alert('你想查找的应该是尾页:'+pageInfo.getPages()+'页吧');window.location.href='../chapter1/zhangle/BBSWorks/comment.jsp';</script>");

            }*/
        }
        request.getRequestDispatcher("../chapter1/zhangle/BBSWorks/comment.jsp").forward(request,response);


    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);

    }
}

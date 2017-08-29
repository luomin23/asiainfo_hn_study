package com.asiainfo.chapter1.hanjunwen.webDemo.blog.controller.blog;

import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.OperationBlogDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.dao.impl.OperationBlogDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.util.PageUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetAllBlogsWithPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        int page=Integer.parseInt(request.getParameter("page"));
        OperationBlogDAO obd = new OperationBlogDAOImpl();
        PageUtil pu=obd.getAllBlogsWithPage(page);
        int rows=obd.getAllBlogsRows();
        pu.setRows(rows);
        int pages=pu.getPageCount(rows,3);
        pu.setPageCount(pages);
        request.setAttribute("rows",rows);
        request.setAttribute("pu",pu);
        request.setAttribute("page",page);
        request.setAttribute("blogs",pu.getList());
        request.getRequestDispatcher("/toUserIndexWithPageS?page=1").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

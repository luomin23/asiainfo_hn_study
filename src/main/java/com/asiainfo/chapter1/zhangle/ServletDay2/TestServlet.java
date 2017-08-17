package com.asiainfo.chapter1.zhangle.ServletDay2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by del on 2017/8/15.
 */
public class TestServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        PrintWriter pw=response.getWriter();
        if(name.equals("zl") && pwd.equals("1234")){
            //response.sendRedirect("/chapter1/zhangle/JSPWords/Forward.jsp"); //两次请求
            request.getRequestDispatcher("/chapter1/zhangle/JSPWords/Forward.jsp").forward(request,response);

        }else {
            System.out.println("错误");

        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }
}

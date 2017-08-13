package com.asiainfo.chapter1.zhangle.August11th;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by del on 2017/8/11.
 */
public class TestJsp extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");  //设置请求编码格式
        response.setContentType("text/html;charset=UTF-8");
        //RequestDispatcher rd=request.getRequestDispatcher("../chapter1/zhangle/August11th/Forward.jsp");
        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        if(name.equals("zl") && pwd.equals("1234")){
            //response.sendRedirect("/chapter1/zhangle/August11th/Forward.jsp"); //两次请求
            request.getRequestDispatcher("/chapter1/zhangle/August11th/Forward.jsp").forward(request,response);

        }else {
            System.out.println("错误");
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }
}

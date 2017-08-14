package com.asiainfo.chapter1.zhangyang.week5_day_04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 11 on 2017/8/10.
 */
@WebServlet( name = "TestServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String high = request.getParameter("high");
        int num = Integer.parseInt(request.getParameter("num"));
        PrintWriter out = response.getWriter();
        out.println("high=" +high);
        out.println("num="+num);
        out.println("num is"+(num%2==0?"Even":"Odd"));
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

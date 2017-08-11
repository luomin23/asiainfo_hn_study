package com.asiainfo.chapter1.zhangyang.week5_day_05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 11 on 2017/8/11.
 */
@WebServlet(name = "Servlet")
public class HobbyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("gbk");
        response.setCharacterEncoding("gbk");
        String [] hobbies = request.getParameterValues("hobbies");
        PrintWriter out = response.getWriter();
        out.println("hobbies=");
        for(String hobby:hobbies){
            out.println(hobby+",");
        }
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

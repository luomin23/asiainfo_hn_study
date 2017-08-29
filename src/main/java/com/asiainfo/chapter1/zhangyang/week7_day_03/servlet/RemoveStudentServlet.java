package com.asiainfo.chapter1.zhangyang.week7_day_03.servlet;

import com.asiainfo.chapter1.zhangyang.week7_day_03.daoimpl.StudentDaoimpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 11 on 2017/8/21.
 */

public class RemoveStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        String sno = request.getParameter("sno");
        StudentDaoimpl studao = new StudentDaoimpl();
        studao.delete(sno);
        request.getRequestDispatcher("QueryStudentServlet").forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

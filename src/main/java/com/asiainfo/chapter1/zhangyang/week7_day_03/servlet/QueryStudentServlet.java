package com.asiainfo.chapter1.zhangyang.week7_day_03.servlet;

import com.asiainfo.chapter1.zhangyang.week7_day_03.daoimpl.StudentDaoimpl;
import com.asiainfo.chapter1.zhangyang.week7_day_03.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 11 on 2017/8/21.
 */

public class QueryStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        String pageno= request.getParameter("currentpageno");
        int currentpageno=1;
        if(pageno!=null){
            currentpageno=Integer.parseInt(pageno);
        }
        StudentDaoimpl studao = new StudentDaoimpl();
        List<Student> list = studao.getAllStudent(currentpageno);
        int a=studao.getPageCount();
        request.setAttribute("list",list);
        request.setAttribute("currentpageno", currentpageno);
        request.setAttribute("PageCount", a);
        request.getRequestDispatcher("/chapter1/zhangyang/week7_day_03/queryStudent.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

package com.asiainfo.chapter1.zhangyang.week7_day_01.Servlet;

import com.asiainfo.chapter1.zhangyang.week7_day_01.dao.StudentDao;
import com.asiainfo.chapter1.zhangyang.week7_day_01.entity.Student;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 11 on 2017/8/21.
 */

public class AddStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String sno = request.getParameter("sno");
        String sname = request.getParameter("sname");
        Date birthday = null;
        String birthstr = request.getParameter("birthday");
        if(birthstr!=null||!"".equals(birthstr)){
            SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
            try {
                birthday = sdf.parse(birthstr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        String major = request.getParameter("major");
        String agestr  = request.getParameter("age");
        int age =0;
        if(agestr!=null||!"".equals(agestr)){
            age = Integer.parseInt(agestr);
        }
        String genderstr = request.getParameter("gender");
        int gender = 0;
        if (genderstr!=null&&!"".equals(genderstr)){
            gender = Integer.parseInt(genderstr);
            Student student = new Student(sno,sname,birthday,major,age,gender);
            StudentDao studentDao = new StudentDao();
            studentDao.insertStudent(student);
            request.getRequestDispatcher("/QueryStudentServlet").forward(request, response);
            System.out.println("添加成功！");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

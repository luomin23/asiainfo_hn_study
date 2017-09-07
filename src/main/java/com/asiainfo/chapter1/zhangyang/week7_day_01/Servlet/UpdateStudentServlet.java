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

public class UpdateStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        String sno = request.getParameter("sno");
        String sname=request.getParameter("sname");
        Date birthday=null;
        String birthdayStr = request.getParameter("birthday");
        if(birthdayStr!=null&&!"".equals(birthdayStr)){
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            try {
                birthday=sdf.parse(birthdayStr);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        String major = request.getParameter("major");
        String ageStr = request.getParameter("age");
        int age=0;
        if(ageStr!=null&&!"".equals(ageStr)){
            age =Integer.parseInt(ageStr);
        }
        String genderStr = request.getParameter("gender");
        int gender=0;
        if(genderStr!=null&&!"".equals(gender)){
            gender=Integer.parseInt(genderStr);
        }
        Student student = new Student(sno, sname, birthday, major, age, gender);
        StudentDao studao = new StudentDao();
        studao.update(student);
        request.getRequestDispatcher("QueryStudentServlet").forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

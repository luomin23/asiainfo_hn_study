package com.asiainfo.chapter1.xushuo.Servlet.EnrollDemox;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by root on 2017/8/18.
 */
public class EnrollDemox extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //获取传过来的表单数据,根据表单中的name获取所填写的值
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        String sex = request.getParameter("sex");
        String[] hobbys = request.getParameterValues("hobby");

        System.out.println(userName);
        System.out.println(pwd);
        System.out.println(sex);
        for (int i = 0; hobbys!=null&&i < hobbys.length; i++) {
            System.out.println(hobbys[i]+"\t");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

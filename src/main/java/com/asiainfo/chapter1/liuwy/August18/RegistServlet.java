package com.asiainfo.chapter1.liuwy.August18;

import com.asiainfo.chapter1.liuwy.zuoye.Person;
import com.asiainfo.chapter1.liuwy.zuoye.PersonBIZ;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by LENOVO on 2017/8/18.
 */
public class RegistServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet deGet方法！");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet doPost方法！");
        req.setCharacterEncoding("utf-8");
        String name=req.getParameter("name");
        String phonenumber=req.getParameter("phonenumber");
        int num=Integer.parseInt(phonenumber);
        String address=req.getParameter("address");
        String emil=req.getParameter("emil");
        String age=req.getParameter("age");
        int age2=Integer.parseInt(age);
        PersonBIZ personBIZ=new PersonBIZ();
        Person person=new Person(name,num,address,emil,age2);
        if(personBIZ.save(person)==true){
            resp.sendRedirect("chapter1//liuwy//August18//yes.jsp");

        }

    }
}

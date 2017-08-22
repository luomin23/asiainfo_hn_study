package com.asiainfo.chapter1.liuwy.August21;

import com.asiainfo.chapter1.liuwy.zuoye.Person;
import com.asiainfo.chapter1.liuwy.August08.PersonBIZ;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LENOVO on 2017/8/21.
 */
public class UpdateServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dopost方法！");
        req.setCharacterEncoding("utf-8");
        String id=req.getParameter("id");
        int i=Integer.parseInt(id);
        String name=req.getParameter("name");
        String phonenumber=req.getParameter("phone");
        int num=Integer.parseInt(phonenumber);
        String address=req.getParameter("address");
        String emil=req.getParameter("emil");
        String age=req.getParameter("age");
        int age2=Integer.parseInt(age);
        PersonBIZ personBIZ=new PersonBIZ();
        Person person=new Person(i,name,num,address,emil,age2);
        if(personBIZ.update(person)==true){
            resp.sendRedirect("chapter1//liuwy//August18//yes.jsp");

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}

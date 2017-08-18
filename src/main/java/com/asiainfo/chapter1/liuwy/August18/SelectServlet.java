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
public class SelectServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.print("hi");
        String phonenumber=req.getParameter("phone");
        int num=Integer.parseInt(phonenumber);
//        PersonBIZ personBIZ = new PersonBIZ();
//        Person person = personBIZ.findByPhone(phonenumber);
//        if (person == null) {
//            System.out.println("有问题");
//        } else {
//            System.out.println(person.getId());
//            System.out.println(person.getName());
//
//        }
        PersonBIZ personBIZ=new PersonBIZ();
        Person person=personBIZ.findByPhone(num);
        if(person!=null){
            int id=person.getId();
            String name=person.getName();
            int phone=person.getPhonenumber();
            System.out.println(id+" "+name+" "+phone);
            req.setAttribute("id",id);
            req.setAttribute("name",name);
            req.setAttribute("phone",phone);
            //System.out.print(req.getParameter("name"));
            resp.sendRedirect("chapter1/liuwy/August18/message.jsp");
        }
    }
}

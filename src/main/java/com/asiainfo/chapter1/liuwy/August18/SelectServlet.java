package com.asiainfo.chapter1.liuwy.August18;

import com.asiainfo.chapter1.liuwy.zuoye.Person;
import com.asiainfo.chapter1.liuwy.zuoye.PersonBIZ;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.SAAJResult;
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
            String address=person.getAddress();
            String emil=person.getEmil();
            int age=person.getBirth();

            System.out.println(id+" "+name+" "+phone);
            //System.out.print(req.getParameter("name"));
            //resp.sendRedirect("chapter1/liuwy/August18/message.jsp");
            RequestDispatcher rd = req.getRequestDispatcher("chapter1/liuwy/August18/message.jsp");
            req.setAttribute("id",id);
            req.setAttribute("name",name);
            req.setAttribute("phone",phone);//存值
            req.setAttribute("address",address);
            req.setAttribute("emil",emil);
            req.setAttribute("age",age);
            rd.forward(req,resp);
        }
    }
}

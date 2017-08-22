package com.asiainfo.chapter1.liuwy.August21;

import com.asiainfo.chapter1.liuwy.August08.PersonBIZ;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by LENOVO on 2017/8/21.
 */
public class DeleteServlet extends HttpServlet{


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dopost方法！");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget方法！");
        String id=req.getParameter("id");
        int i=Integer.parseInt(id);
        System.out.print(i);
        PersonBIZ personBIZ=new PersonBIZ();
        if (personBIZ.delete(i)==true){

            resp.sendRedirect("chapter1/liuwy/August18/message.jsp");}else {
            System.out.println("删除失败！");
        }

    }
}

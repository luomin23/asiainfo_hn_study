package com.asiainfo.chapter1.liangzhiqiang.BBSzuoye;

/**
 * Created by 君不悔 on 2017/8/23.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddressServlet extends HttpServlet {
    private AddressDao addressDao = new AddressDao();

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String method = request.getParameter("method");
        String path="list.jsp";

        if(method.equals("list")){
            List<Address> list = addressDao.findAll();
            request.setAttribute("list", list);
        }else if(method.equals("add")){
            String name = request.getParameter("name");
            String street = request.getParameter("street");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            Address address = new Address();
            address.setName(name);
            address.setStreet(street);
            address.setCity(city);
            address.setState(state);
            address.setZip(zip);
            addressDao.add(address);

            path="AddressServlet?method=list";
        }else if(method.equals("delete")){
            int id = Integer.parseInt(request.getParameter("id"));
            addressDao.delete(id);

            path="AddressServlet?method=list";
        }else if(method.equals("toedit")){
            int id = Integer.parseInt(request.getParameter("id"));
            Address address =  addressDao.findById(id);

            request.setAttribute("address", address);
            path ="edit.jsp";
        }else if(method.equals("edit")){
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String street = request.getParameter("street");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            Address address = new Address();
            address.setId(id);
            address.setName(name);
            address.setStreet(street);
            address.setCity(city);
            address.setState(state);
            address.setZip(zip);
            addressDao.update(address);

            path="AddressServlet?method=list";
        }
        request.getRequestDispatcher(path).forward(request, response);


    }


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

}

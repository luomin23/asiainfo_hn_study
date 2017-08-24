package com.asiainfo.chapter1.dongwenchao.web.day2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created by 超超 on 2017/8/18 0018.
 */
public class TestServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> a= Arrays.asList("河南","郑州");
        request.setAttribute("a",a);
        //通过转发响应传给b.jsp
        request.getRequestDispatcher("/chapter1/dongwenchao/web/b.jsp").forward(request,response);
        System.out.println(111);
    }
}

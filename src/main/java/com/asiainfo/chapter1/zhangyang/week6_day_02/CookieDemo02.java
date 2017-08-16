package com.asiainfo.chapter1.zhangyang.week6_day_02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Created by 11 on 2017/8/15.
 */
@WebServlet(name = "Servlet4")
public class CookieDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //输出网站所有商品
        out.println("本网站有如下商品：<br/>");
        Map<String, Book> map = DB.getAll();
        for (Map.Entry<String, Book> entry : map.entrySet()) {
            Book book = entry.getValue();
            out.println("<a href='/?id=" + book.getId() + "'>" + book.getName() + "</a><br/>");
            //显示用户看过的商品
            out.println("<br/>您曾经看过如下商品：<br/>");
            Cookie cookies[] = request.getCookies();
            for (int i = 0; cookies != null && i < cookies.length; i++) {
                if (cookies[i].getName().equals("bookHistory")) {
                    String str[] = cookies[i].getValue().split("\\,");
                    for (String id : str) {
                        Book book1 = (Book) DB.getAll().get(id);
                        out.println(book1.getName()+"<br/>");
                    }
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
    class DB{
        private static Map<String,Book> map = new LinkedHashMap();
        static {
            map.put("1",new Book("1","javaweb1","张扬","好书"));
            map.put("2",new Book("2","javaweb2","张扬","好书"));
            map.put("3",new Book("3","javaweb3","张扬","好书"));
            map.put("4",new Book("4","javaweb4","张扬","好书"));
            map.put("5",new Book("5","javaweb5","张扬","好书"));
        }
        public static  Map getAll(){

            return map;
        }
    }
    class Book{
        private  String id;
        private  String name;
        private  String auter;
        private  String description;

        public Book() {
            super();
        }
        public Book(String id,String name,String auter,String description){
            super();
            this.id = id;
            this.name = name;
            this.auter = auter;
            this.description = description;

        }
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuter() {
            return auter;
        }

        public void setAuter(String auter) {
            this.auter = auter;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }


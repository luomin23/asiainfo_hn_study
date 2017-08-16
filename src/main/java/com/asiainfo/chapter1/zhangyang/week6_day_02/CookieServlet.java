package com.asiainfo.chapter1.zhangyang.week6_day_02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by 11 on 2017/8/15.
 */
@WebServlet(name = "Servlet3")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        //获取用户带过来的数据
        String id =request.getParameter("id");
        Book book = (Book) DB.getAll().get(id);
        out.println(book.getId());
        out.println(book.getName());
        out.println(book.getAuter());
        out.println(book.getDescription());
        //构建cookie，回写给浏览器
        String cookieValue = bulidCookie(id,request);
        Cookie cookie = new Cookie("bookHistory",cookieValue);
        cookie.setMaxAge(1*30*24*60);
        response.addCookie(cookie);
    }

    private String bulidCookie(String id, HttpServletRequest request) {
        String bookHistory = null;
        Cookie cookies[] = request.getCookies();
        for (int i = 0; cookies != null && i < cookies.length; i++) {
            if (cookies[i].getName().equals("bookHistory")) {
                bookHistory = cookies[i].getValue();
            }
        }
        if (bookHistory==null) {
            return id;
        }
        LinkedList<String> list = new LinkedList(Arrays.asList(bookHistory.split("\\,")));
        if (list.contains(id)){
            list.remove(id);
        }else {
            if (list.size()>=3){
                list.removeLast();
            }
        }
        list.addFirst(id);
        StringBuffer sb = new StringBuffer();
        for (String bid :list){
            sb.append(bid+",");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

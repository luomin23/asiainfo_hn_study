package com.asiainfo.chapter1.dongwenchao.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by 超超 on 2017/8/15 0015.
 */

public class AddMessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String author=new String(request.getParameter("aut").getBytes("ISO-8859-1"),"UTF-8");
        String title=new String(request.getParameter("title").getBytes("ISO-8859-1"),"UTF-8");
        String content=new String(request.getParameter("content").getBytes("ISO-8859-1"),"UTF-8");
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String today=format.format(new Date());
        MessageBean mm=new MessageBean();
        mm.setAuthor(author);
        mm.setTitle(title);
        mm.setContent(content);
        mm.setTime(today);
        HttpSession session=request.getSession();
        ServletContext scx=session.getServletContext();
        ArrayList wordlist=(ArrayList)scx.getAttribute("wordlist");
        if (wordlist==null){
            wordlist=new ArrayList();
            wordlist.add(mm);
            scx.setAttribute("wordlist",wordlist);
            response.sendRedirect("chapter1/dongwenchao/web/ShowMessage.jsp");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

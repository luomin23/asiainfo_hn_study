package com.asiainfo.chapter1.wangjz.java.javaday1.Servlet2;

import com.asiainfo.chapter1.wangjz.java.javaday1.Servlet2.MessageBean;

import javax.servlet.ServletConfig;
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
 * Created by wjz123456 on 2017/8/18.
 */
public class AddMessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String author=new String(request.getParameter("author"));
        String title=new String(request.getParameter("title"));
        String content=new String(request.getParameter("content"));
        SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String today=format.format(new Date());
        MessageBean mm=new MessageBean();
        mm.setAuthor(author);
        mm.setTitle(title);
        mm.setContent(content);
        mm.setTime(today);
        HttpSession session=request.getSession();
        ServletContext scx=session.getServletContext();
        ArrayList wordlist=(ArrayList) scx.getAttribute("wordlist");
        if(wordlist==null)
            wordlist=new ArrayList();
        wordlist.add(mm);
        scx.setAttribute("wordlist",wordlist);
        response.sendRedirect("chapter1/wangjz/jsp3/showMessage.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

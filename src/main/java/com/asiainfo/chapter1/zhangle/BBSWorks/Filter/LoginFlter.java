package com.asiainfo.chapter1.zhangle.BBSWorks.Filter;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by del on 2017/8/22.
 */
public class LoginFlter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out=servletResponse.getWriter();
        HttpServletRequest hrequest=(HttpServletRequest)servletRequest;
        HttpServletResponse hresponse=(HttpServletResponse)servletResponse;
        HttpSession session= hrequest.getSession();  //request 是HttpServletRequest 相互对应
        String loginFlag=(String) session.getAttribute("loginFlag");
        System.out.println("登录过滤启动");
        if("pass".equals(loginFlag)){

            filterChain.doFilter(servletRequest,servletResponse);

        }else {
            //未登录 先跳转至登录界面
            out.print("<script language='javascript'>" +
                    "alert('请先登录');" + "</script>");
            //window.location.href='../chapter1/zhangle/BBSWorks/Index.jsp';
            hresponse.sendRedirect("../chapter1/zhangle/BBSWorks/Index.jsp");

        }
    }

    @Override
    public void destroy() {

    }
}

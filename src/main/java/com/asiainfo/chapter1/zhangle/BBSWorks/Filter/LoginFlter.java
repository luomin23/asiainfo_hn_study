package com.asiainfo.chapter1.zhangle.BBSWorks.Filter;

import com.asiainfo.chapter1.liuwy.August07.Request;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by del on 2017/8/22.
 */
public class LoginFlter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest hrequest=(HttpServletRequest)servletRequest;
        HttpServletResponse hresponse=(HttpServletResponse)servletResponse;
        HttpSession session= hrequest.getSession();  //request 是HttpServletRequest 相互对应
        String loginFlag=(String) session.getAttribute("loginFlag");
        if("pass".equals(loginFlag)){
            filterChain.doFilter(servletRequest,servletResponse);

        }else {
            //未登录 先跳转至登录界面
            hresponse.sendRedirect("../../chapter1/zhangle/BBSWorks/Index.jsp");

        }
    }

    @Override
    public void destroy() {

    }
}

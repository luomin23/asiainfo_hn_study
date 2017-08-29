package com.asiainfo.chapter1.zhangyang.week6_day_05.service;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by 11 on 2017/8/23.
 */
public class LoginFilterZ implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("开始");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest hrquest = (HttpServletRequest) servletRequest;
        HttpServletResponse hresponse = (HttpServletResponse) servletResponse;
        HttpSession session  = hrquest.getSession();
        String user  = (String) session.getAttribute("person");
        if (user==null||"".equals(user)){
            hresponse.sendRedirect("/chapter1/zhangyang/week6_day_05/login1.jsp");
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {
        System.out.println("用户未登录");
    }
}

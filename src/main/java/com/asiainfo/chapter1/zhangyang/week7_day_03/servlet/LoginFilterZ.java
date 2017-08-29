package com.asiainfo.chapter1.zhangyang.week7_day_03.servlet;

import com.asiainfo.chapter1.zhangyang.week7_day_03.entity.Person;

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
        Person user  = (Person) session.getAttribute("person");
        if (user==null||"".equals(user)){
            hresponse.sendRedirect("/chapter1/zhangyang/week7_day_03/tip.jsp");
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }
    @Override
    public void destroy() {

    }
}

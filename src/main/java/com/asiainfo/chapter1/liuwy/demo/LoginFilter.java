package com.asiainfo.chapter1.liuwy.demo;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by LENOVO on 2017/8/25.
 */
public class LoginFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest=(HttpServletRequest)servletRequest;
        //HttpServletResponse httpServletResponse=(HttpServletResponse)servletResponse;
        HttpSession session=httpServletRequest.getSession();
        if (session.getAttribute("admin")==null){
            String message="您没有访问此网页权限！";
            httpServletRequest.setAttribute("message", message);
            httpServletRequest.getRequestDispatcher("/chapter1//liuwy//demo//errmessage.jsp").forward(servletRequest, servletResponse);
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}

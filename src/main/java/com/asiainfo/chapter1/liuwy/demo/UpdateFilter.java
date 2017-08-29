package com.asiainfo.chapter1.liuwy.demo;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by LENOVO on 2017/8/25.
 */
public class UpdateFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("updatefilter过滤器!");
        HttpServletRequest httpServletRequest=(HttpServletRequest)servletRequest;
        //HttpServletResponse httpServletResponse=(HttpServletResponse)servletResponse;
        HttpSession session=httpServletRequest.getSession();
        if (session.getAttribute("admin")=="1"){
            System.out.println("管理员不能修改！");
            String message="您不可以修改用户信息！";
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

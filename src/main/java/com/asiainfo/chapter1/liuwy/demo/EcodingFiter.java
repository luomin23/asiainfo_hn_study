package com.asiainfo.chapter1.liuwy.demo;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by LENOVO on 2017/8/25.
 */
public class EcodingFiter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;
        if (httpServletRequest.getMethod().equalsIgnoreCase("post")) {
            httpServletRequest.setCharacterEncoding("utf-8");
        }
        filterChain.doFilter(httpServletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}

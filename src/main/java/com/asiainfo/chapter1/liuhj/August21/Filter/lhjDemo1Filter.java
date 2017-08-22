package com.asiainfo.chapter1.liuhj.August21.Filter;

import javax.servlet.*;
import java.io.IOException;

public class lhjDemo1Filter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("DemoFilter拦截到了请求。。。");
        System.out.println("Demo1filter 前");
        //默认情况下不放行请求，但是标注一下语句时放行请求
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Demo2filter 后");
    }

    @Override
    public void destroy() {

    }
}

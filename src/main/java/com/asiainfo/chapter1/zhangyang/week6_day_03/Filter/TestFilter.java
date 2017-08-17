package com.asiainfo.chapter1.zhangyang.week6_day_03.Filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by 11 on 2017/8/16.
 */
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("***init()***");
    }

    @Override
    public void destroy() {
        System.out.println("***destroy()***");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         System.out.println("***filter();调用dofilter()之前***");
        //filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("***filter();调用dofilter()之后***");
    }
}

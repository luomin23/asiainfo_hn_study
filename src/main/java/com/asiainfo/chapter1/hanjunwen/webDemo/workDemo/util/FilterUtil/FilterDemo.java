package com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.util.FilterUtil;

import javax.servlet.*;
import java.io.IOException;

public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("====过滤器初始化====");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setCharacterEncoding("utf-8");
        servletRequest.setCharacterEncoding("utf-8");
//        System.out.println("===过滤完成===");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
//        System.out.println("===过滤器销毁===");
    }
}

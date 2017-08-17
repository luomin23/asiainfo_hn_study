package com.asiainfo.chapter1.wangjz.java.javaday1.Servlet2;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wjz123456 on 2017/8/17.
 */
public class LogFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("www.badeu.com");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
String wjz=config.getInitParameter("wjz");
        System.out.println(wjz);
    }

}

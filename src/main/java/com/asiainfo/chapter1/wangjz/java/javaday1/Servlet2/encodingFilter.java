package com.asiainfo.chapter1.wangjz.java.javaday1.Servlet2;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wjz123456 on 2017/8/17.
 */
public class encodingFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

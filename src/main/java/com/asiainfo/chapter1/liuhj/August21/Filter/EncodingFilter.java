package com.asiainfo.chapter1.liuhj.August21.Filter;

import javax.servlet.*;
import java.io.IOException;

//配置全站乱码过滤器当响应时，设置为UTF-8解决乱码
public class EncodingFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

package com.asiainfo.chapter1.wangjz.java.javaday1.Servlet2;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wjz123456 on 2017/8/17.
 */
public class LogFilter implements Filter {
    static String w;
    public FilterConfig filterConfig;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // String initUser=filterConfig.getInitParameter("username");
        String username=req.getParameter("username");
        System.out.println(username);
        if(!w.equals(username)){
        req.setAttribute("message","用户名不正确！");
            req.getRequestDispatcher("/chapter1/wangjz/jsp2/login.jsp").forward(req,resp);
            return;
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
  w=config.getInitParameter("username");
        System.out.println(w);
    }

}

package com.asiainfo.chapter1.luhui.luhui15;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.asiainfo.chapter1.wangjz.java.javaday1.javazuoye.UDPServer.name;

/**
 * Created by 18237161432 on 2017/8/18.
 */
public class filterLogin implements Filter {
    private FilterConfig filterConfig;

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("Demo1过滤前");
        System.out.println(filterConfig.getInitParameter("param1"));
        chain.doFilter(request, response);//放行。让其走到下个链或目标资源中
        System.out.println("Demo1过滤后");
    }
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化了");
        this.filterConfig = filterConfig;
    }
    public void destroy() {
        System.out.println("销毁了");
    }
}
package com.asiainfo.chapter1.liuhj.August21.Filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class lhjDemoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("DemoFilter初始化了。。。");
        filterConfig.getServletContext();
//        String v =filterConfig.getInitParameter("name1");
//        System.out.println(v);
          Enumeration<String> enumeration = filterConfig.getInitParameterNames();
          while (enumeration.hasMoreElements()){
              String name =enumeration.nextElement();
              String value=filterConfig.getInitParameter(name);
              System.out.println(name+":"+value);



          }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("DemoFilter拦截到了请求。。。");
        System.out.println("Demofilter 前");
        //默认情况下不放行请求，但是标注一下语句时放行请求
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Demofilter 后");
    }

    @Override
    public void destroy() {

        System.out.println("DemoFilter销毁了。。。");

    }
}

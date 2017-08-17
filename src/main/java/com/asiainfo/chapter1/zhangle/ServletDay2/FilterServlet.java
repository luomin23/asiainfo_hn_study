package com.asiainfo.chapter1.zhangle.ServletDay2;

import com.sun.net.httpserver.*;

import javax.servlet.*;
import javax.servlet.Filter;
import java.io.IOException;

/**
 * Created by del on 2017/8/16.
 */
public class FilterServlet implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //获取初始化参数
        String site= filterConfig.getInitParameter("name");
        //输出初始化参数
        System.out.println("账号:"+site);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        //输出站点名称
        System.out.println("编码过滤器");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");  //servlet界面的编码
        response.setContentType("text/html;UTF-8");

        //把请求传回过滤链
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}

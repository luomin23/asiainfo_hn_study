package com.asiainfo.chapter1.xushuo.Servlet.ServletFilterx;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by root on 2017/8/17.
 */
public class FilterxDemo01 implements Filter {
    public void init(FilterConfig config) throws ServletException {
        //获取初始化参数
        String site = config.getInitParameter("site");

        //输出初始化参数
        System.out.println("网站名称:" +site);
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        //输出站点地址
        System.out.println("站点网址: http:www/baidu.com");

        //把请求传回过滤器
        chain.doFilter(req, resp);
    }

    public void destroy() {
//        在filter实例被web容器从服务移除之前调用
    }

}

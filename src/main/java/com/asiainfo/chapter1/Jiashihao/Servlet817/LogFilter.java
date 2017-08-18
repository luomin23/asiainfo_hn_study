package com.asiainfo.chapter1.Jiashihao.Servlet817;

import java.util.*;
import javax.servlet.*;

public class LogFilter implements Filter {
    public void init(FilterConfig config) throws ServletException{
       String site = config.getInitParameter("Site");
        //获取初始化参数
        System.out.println("网站名称："+site);
        //输出初始化参数
    }

   public  void doFilter(ServletRequest request, ServletResponse response,FilterChain chain)
            throws java.io.IOException,ServletException {
        System.out.println("站点网址：www.baidu.com");
       //输出站点
       chain.doFilter(request,response);
       //把请求传回过滤链
    }
    public void destroy() {
        /*在Filter实例被web容器从服务器移除之前调用*/
    }
}

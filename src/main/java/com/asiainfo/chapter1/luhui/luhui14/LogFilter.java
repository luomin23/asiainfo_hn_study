/*
package com.asiainfo.chapter1.luhui.luhui14;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

*
 * Created by 18237161432 on 2017/8/17.


public class LogFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       //获取初始化参数
        String site=config.getInitParameter("Site");
        //输出初始化参数
        System.out.println("网站名称"+site);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
//输出站点名称
        System.out.println("站点网址：http://www.runoob.com");
        //把请求传回过滤链
        filterChain.doFilter(servletRequest,servletResponse);//放行。
    }

    @Override
    public void destroy() {
        //在Fileter实例被web容器从服务移除之前调用。

    }
}
*/

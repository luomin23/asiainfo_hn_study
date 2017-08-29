package com.asiainfo.chapter1.hanjunwen.webDemo.blog.util.FilterUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("====过滤器初始化====");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        servletResponse.setCharacterEncoding("utf-8");
//        servletRequest.setCharacterEncoding("utf-8");
//        System.out.println("=========过滤器完成==========");
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        HttpServletResponse res=(HttpServletResponse) servletResponse;
        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");
        String username=(String)req.getSession().getAttribute("username");
//        System.out.println(username);
        if(username!=null&&!username.equals("")){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            String result="请先登录！";
            req.setAttribute("loginResult",result);
            req.getRequestDispatcher("/toLoginDemo").forward(req,res);
        }
//        System.out.println("===过滤完成===");
    }

    @Override
    public void destroy() {
//        System.out.println("===过滤器销毁===");
    }
}

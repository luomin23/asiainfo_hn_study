package com.asiainfo.chapter1.wangjz.java.javaday1.ServletDay1;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wjz123456 on 2017/8/15.
 */
public abstract class Hello implements Servlet{
    @Override
    public void destroy() {
        System.out.println("jieshu");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
System.out.println("init");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
System.out.println("service");
    }
public Hello(){
    System.out.println("hello");
}

    }


package com.asiainfo.chapter1.liuhj.August21.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class lhjListener  implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContexEvent对象被创建了。。。"+servletContextEvent.getServletContext());

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContexEvent对象被销毁了。。。"+servletContextEvent.getServletContext());

    }
}

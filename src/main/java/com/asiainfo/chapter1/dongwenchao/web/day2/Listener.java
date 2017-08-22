package com.asiainfo.chapter1.dongwenchao.web.day2;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeListener;

/**
 * Created by 超超 on 2017/8/17 0017.
 */
public class Listener implements ServletContextListener{
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("init");
    }
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("die");
    }

}

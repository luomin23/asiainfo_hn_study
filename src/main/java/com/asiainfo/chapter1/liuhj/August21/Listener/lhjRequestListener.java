package com.asiainfo.chapter1.liuhj.August21.Listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class lhjRequestListener implements ServletRequestListener {


    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("request对象被销毁了。。。。");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("request对象被创建出来了。。。。。");
    }
}

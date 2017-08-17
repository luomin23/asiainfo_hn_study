package com.asiainfo.chapter1.zhangle.ServletDay2;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by del on 2017/8/17.
 * 实现对在线人数的监听
 */
public class ListenerWorks implements HttpSessionListener{
    public static int number;
    public ListenerWorks()   {
        number = 0;
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        number++;
        System.out.println("开始"+number);
        httpSessionEvent.getSession().setAttribute("personTotal",number);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        number--;
        httpSessionEvent.getSession().setAttribute("personTotal",number);

    }
}

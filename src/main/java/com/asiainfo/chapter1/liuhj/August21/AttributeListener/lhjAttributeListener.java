package com.asiainfo.chapter1.liuhj.August21.AttributeListener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

// 演示监听三大作用域中属性变化的监听器

public class lhjAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("属性被加入到了SC域中"+servletContextAttributeEvent.getName()+":"+servletContextAttributeEvent.getValue());

    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("属性被移除到了SC域中"+servletContextAttributeEvent.getName()+":"+servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {

        System.out.println("属性被替换到了SC域中"+servletContextAttributeEvent.getName()+":"+servletContextAttributeEvent.getValue());
    }
}

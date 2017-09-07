package com.asiainfo.chapter1.luomin.jmx.demo1;

/**
 * @author Luoo
 * @create 2017-08-23 14:55
 */

public interface HelloMBean {
    public String getName();

    public void setName(String name);

    public void printHello();

    public void printHello(String whoName);
}


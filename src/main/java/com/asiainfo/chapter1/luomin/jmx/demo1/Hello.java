package com.asiainfo.chapter1.luomin.jmx.demo1;

/**
 * @author Luoo
 * @create 2017-08-23 14:54
 */

public class Hello implements HelloMBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello World, " + name);
    }

    public void printHello(String whoName) {
        System.out.println("Hello , " + whoName);
    }
}


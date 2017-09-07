package com.asiainfo.chapter1.luomin.pattern.proxy.intercept;

/**
 * @author Luoo
 * @create 2017-08-25 10:48
 */

public abstract class Action {
    abstract void doGet();

    abstract void doPost();

    void execute() {
        System.out.println("execute action.");
        doGet();
        doPost();
    }
}

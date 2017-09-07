package com.asiainfo.chapter1.luomin.pattern.proxy.intercept;

/**
 * @author Luoo
 * @create 2017-08-25 10:48
 */

public class Client {
    public static void main(String[] args) {
        new ActionInvocation(new FirstAction()).invoke();
    }
}

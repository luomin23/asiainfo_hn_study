package com.asiainfo.chapter1.luomin.reflex.proxy1;

/**
 * @author Luoo
 * @create 2017-08-24 14:17
 */

public class Authority {
    //第一个拦截方法
    public void first() {
        System.out.println("------第一个切面方法------");
    }
    //第二个拦截方法
    public void last() {
        System.out.println("------最后一个切面方法------");
    }
}

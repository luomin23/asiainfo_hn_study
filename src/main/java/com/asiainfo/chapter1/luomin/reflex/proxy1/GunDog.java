package com.asiainfo.chapter1.luomin.reflex.proxy1;

/**
 * @author Luoo
 * @create 2017-08-24 14:16
 */

public class GunDog implements Dog {
    @Override
    public void info() {
        System.out.println("I am a gundog!");
    }

    @Override
    public void run() {
        System.out.println("I run fast!");
    }
}

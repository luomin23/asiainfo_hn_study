package com.asiainfo.chapter1.luomin.pattern.singleton;

/**
 * 双重检查加锁，针对懒汉式提升性能
 */

public class TwoCheck {
    private volatile static TwoCheck twoCheck = null;

    private TwoCheck() {

    }

    public static TwoCheck getInstance() {
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if (twoCheck == null) {
            //同步块，线程安全的创建实例
            synchronized (TwoCheck.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if (twoCheck == null) {
                    twoCheck = new TwoCheck();
                }
            }
        }
        return twoCheck;
    }
}
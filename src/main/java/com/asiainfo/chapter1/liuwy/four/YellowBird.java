package com.asiainfo.chapter1.liuwy.four;

/**
 * Created by LENOVO on 2017/7/27.
 */
public class YellowBird extends Bird{
    public YellowBird() {
        super("黄风", "黄色");

    }

    @Override
    public void fly() {
        System.out.println("加速飞");
    }
}

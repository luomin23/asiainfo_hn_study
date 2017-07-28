package com.asiainfo.chapter1.liuwy.four;

/**
 * Created by LENOVO on 2017/7/27.
 */
public class BlueBird extends Bird{
    public BlueBird() {
        super("蓝色", "蓝冰");

    }

    @Override
    public void fly() {
        System.out.println("分三个飞");
    }
}

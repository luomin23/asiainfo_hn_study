package com.asiainfo.chapter1.xushuo.x0726_28.Yuyan;

/**
 * Created by root on 2017/7/28.
 */
public class TestYuyan {
    public static void main(String[] args) {
//        Chinese p = new Chinese();
//        American p2 = new American();
//        p.say();
//        p2.say();
// 以继承关系完成

//        Person p = new Chinese();
//        Person p2 = new American();
//        p.say();
//        p2.say();
////以多态关系完成
        APerson p = new Chinese();
        APerson p2 = new American();
        p.say();
        p2.say();
        //以抽象类完成
    }
}

package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_03;

/**
 * Created by 11 on 2017/7/26.
 */
interface Animal{
    public void eat();
    public void travel();
}
class Action implements Animal{


    public void eat() {
        System.out.println("action eat");

    }


    public void travel() {
        System.out.println("action travel");

    }

}
public class InterfaceDemo03 {
    public static void main(String[] args) {
        Action a1 = new Action();
        a1.eat();
        a1.travel();
    }

}

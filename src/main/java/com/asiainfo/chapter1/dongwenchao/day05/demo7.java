package com.asiainfo.chapter1.dongwenchao.day05;

/**
 * Created by 超超 on 2017/7/28 0028.
 */
public class demo7 {
    public void eat(){
        System.out.println("a");
    }
    public void play(){
        System.out.println("haohaowan");
    }
}
class z extends demo7{
    public void eat(){
        System.out.println("zxc");
    }
    public void fly(){
        System.out.println("a");
    }
public static void main(String[] agrs){
    demo7 o=new z();
    o.play();
    z e= (z)o;
    e.fly();
}
}


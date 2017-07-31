package com.asiainfo.chapter1.fengzx.July28;

/**
 * Created by fengzx on 2017/7/28.
 */

class Father1{
    public int x = 100;

    public void show(){
        System.out.println(x);
    }

    public void method(){
        System.out.println(x);
    }
}

class Son1 extends Father1{
    //public int x = 10;
    public int y = 20;

    public void show(){
        System.out.println(x);
    }

    public void method(){
        System.out.println(x);
        System.out.println(y);
    }
}

public class PolymorphicDemo1 {
    public static void main(String[] args){
        Father1 f = new Son1();
        f.show();
        f.method();
    }
}

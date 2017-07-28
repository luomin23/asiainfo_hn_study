package com.asiainfo.chapter1.liangzhiqiang.day4;

/**
 * Created by 君不悔 on 2017/7/27.
 */
public class Text1 {
    private static int a;
    private int b;
    static {
        Text1.a=3;
        System.out.println(a);
        Text1 t=new Text1();
        t.f();
        t.b=1000;
        System.out.println(t.b);
    }
    static {
        Text1.a=4;
        System.out.println(a);

    }
    public static void main(String[]args){

    }
    static {
        Text1.a=5;
        System.out.println(a);
    }
    public void f(){
        System.out.println("亚信");
    }
}

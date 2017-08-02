package com.asiainfo.chapter1.fengzx.July28;

/**
 * Created by fengzx on 2017/7/28.
 */


class A{
    public void show(){
        show2();
    }

    public void show2(){
        System.out.print("我");
    }
}

class B extends A{
    public void show2(){
        System.out.print("爱");
    }
}

class C extends B{
    public void show(){
        super.show();
    }

    public void show2(){
        System.out.print("你");
    }
}

public class PolymorphicDemo2 {
    public static void main(String[] args){
        A a = new B();
        a.show();

        B b = new C();
        b.show();
    }
}

package com.asiainfo.chapter1.fengzx.July28;

/**
 * Created by fengzx on 2017/7/28.
 */

class Father{
    public int num = 10;

    public void show(){
        System.out.println("father show");
    }

    public static void function(){
        System.out.println("father function");
    }
}

class Son extends Father{
    public int num = 100;

    public void show(){
        System.out.println("son show");
    }

    public void method(){
        System.out.println("son method");
    }

    public static void function(){
        System.out.println("son function");
    }
}

public class PolymorphicDemo {
    public static void main(String[] args){

        Father f = new Son();

        System.out.println(f.num);

        f.show();
        //f.method();
        f.function();
    }
}

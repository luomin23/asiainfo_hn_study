package com.asiainfo.chapter1.fengzx.July27;

/**
 * Created by fengzx on 2017/7/27.
 */

class Demo{
    int num = 10;
    static int num2 = 100;

    public void show(){
        System.out.println(num);
        System.out.println(num2);
    }

    public void show2(){
        show();
        method();
    }

    public static void method(){
        //System.out.println(num);
        System.out.println(num2);
    }

    public static void method2(){
        //show();
        method();
    }

}

public class StaticTest {
    public static void main(String[] args){

    }
}

package com.asiainfo.chapter1.fengzx.July31;

/**
 * Created by fengzx on 2017/7/31.
 */
public class Test {
    public static void main(String[] args){
        Demo d= new Demo();
        d.print("hello");
        d.print(10);

        Demo<String> d2 = new Demo<String>();
        d2.print("hello");

        Demo<Integer> d3 = new Demo<Integer>();
        d3.print(10);

        Demo<String> d4 = new Demo<String>();
        d4.method("haha");
        d4.method(10);
        d4.method(true);
    }
}

package com.asiainfo.chapter1.fengzx.Aug03;

/**
 * Created by fengzx on 2017/8/3.
 */
public class MyStackDemo {
    public static void main(String[] args){
        MyStack my = new MyStack();

        my.add("hello");
        my.add("world");
        my.add("java");

        while (!my.isEmpty()){
            System.out.println(my.get());
        }
    }
}

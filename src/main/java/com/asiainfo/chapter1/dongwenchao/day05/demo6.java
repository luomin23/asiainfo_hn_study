package com.asiainfo.chapter1.dongwenchao.day05;

/**
 * Created by 超超 on 2017/7/28 0028.
 */
public class demo6 extends demo5{
    public void print() {//强制要求覆写
        System.out.println("Hello World !");
    }
    public static void main(String[] args){
        demo5 z=new demo6();
        z.fun();
        z.print();
    }
}

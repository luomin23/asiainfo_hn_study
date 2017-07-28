package com.asiainfo.chapter1.dongwenchao.day03;

/**
 * Created by 超超 on 2017/7/26 0026.
 */
public class demo4Test {
    public static void main(String [] agrs){
        demo4 t1=new demo4(15,36,42);
        demo4 t2=new demo4(15,36,42);
        demo4 t3=new demo4(t2);
        System.out.printf("%s\n",t1.toUniversalString());
        System.out.printf("%s\n",t1.toString());
        System.out.printf("%s\n",t2.toUniversalString());
        System.out.printf("%s\n",t2.toString());
        System.out.printf("%s\n",t3.toUniversalString());
        System.out.printf("%s\n",t3.toString());
    }
}

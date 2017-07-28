package com.asiainfo.chapter1.dongwenchao.day03;

/**
 * Created by 超超 on 2017/7/26 0026.
 */
public class demo5 {
    public static void main(String[] aegs){
        System.out.println(Math.round(2.56));
        String s = toChar(5.66);  //调用demo5中的toChar()静态方法；
        System.out.println("e="+ s);
    }
    private static String toChar(double x) {
        return Double.toString(x);
    }
}

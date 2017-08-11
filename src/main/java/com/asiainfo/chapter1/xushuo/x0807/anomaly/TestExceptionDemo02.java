package com.asiainfo.chapter1.xushuo.x0807.anomaly;

/**
 * Created by root on 2017/8/4.
 * 方法名后的throws Eceotion1,Exception2,...EsceptionN为声明要抛出的异常列表
 * 当方法抛出异常列表的异常时，方法将不对这些类型及其子类类型的异常作处理，而抛向调用该
 * 方法的方法，由他去处理。
 */
public class TestExceptionDemo02 {
    static void pop() throws NegativeArraySizeException {
    //定义方法并抛出NegativeArraySizeException异常
        int[] arr = new int[-3];  //创建数组
    }

    public static void main(String[] args) {  //主方法
        try {       //try语句处理异常信息
            pop();  //调用pop()方法
        }catch (NegativeArraySizeException e) {
            System.out.println("pop()方法抛出异常");      //输出异常信息
        }
    }
}

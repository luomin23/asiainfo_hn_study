package com.asiainfo.chapter1.xushuo.x0802_03.abnormal;

/**
 * Created by root on 2017/8/3.
 */
public class ExceptionDemo02 {
    public static void arrException(){
        throw new NullPointerException("自行抛出的不检查异常--空指向异常");
    }

    public static void main(String[] args) {
        try{
            arrException();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

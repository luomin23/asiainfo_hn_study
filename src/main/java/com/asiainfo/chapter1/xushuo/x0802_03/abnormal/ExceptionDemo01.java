package com.asiainfo.chapter1.xushuo.x0802_03.abnormal;

/**
 * Created by root on 2017/8/3.
 * try catch finally 语句
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        int i[] ={1,2,3};
        try{
            System.out.println("i[0]="+i[0]);
            System.out.println("i[3]="+i[3]);                               //数组越界异常
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("异常信息： "+e);
        }finally {
            System.out.println("***无论是否有异常，都会执行finally语句***");
        }
        System.out.println("i[1]="+i[1]);
    }
}

package com.asiainfo.chapter1.xushuo.x0807;

/**
 * Created by root on 2017/8/4.
 * RuntimException的子类ArithmeticException。
 * 运行时异常将由运行时系统自动跑出，不需要throw语句
 */
public class ArithmeticExcepyionDemo {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try {
            if(b == 0) throw new ArithmeticException();
            System.out.println("a/b的值是："+a/b);
        }catch(ArithmeticException e) {
            System.out.println("程序出现异常，变量b不能为0");
        }
        System.out.println("程序正常结束");
    }
}

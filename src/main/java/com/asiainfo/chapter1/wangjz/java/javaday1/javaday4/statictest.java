package com.asiainfo.chapter1.wangjz.java.javaday1.javaday4;

/**
 * Created by wjz123456 on 2017/7/27.
 */
public class statictest {
    private static String str1="static成员变量";
    private String str2="非static成员变量";
    public static void  methed1(){
       str1="sss";
        //method2();编译报错，
        // str2="sss";静态方法里只能调用静态变量，静态方法！
        System.out.println("这是static方法");
    }
    public void method2(){
        str1="String1";
        str2="String2";
        methed1();
        System.out.println("这是非static方法");
    }
    public void method3(){
        method2();
    }

    public static void main(String[] args) {
        statictest s=new statictest();
        methed1();//静态方法，不用对象可以直接调用！

        s.method2();
        s.method3();

    }
}

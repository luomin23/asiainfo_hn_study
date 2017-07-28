package com.asiainfo.chapter1.dongwenchao.day03;

/**
 * Created by 超超 on 2017/7/26 0026.
 */
public class demo6 {

        public static int value = 20;
        public static int num = 30;
        public static void main(String[] args){
            demo6.InnerTest.getNum();  //可以访问成员方法。
            //demo6.InnerTest.num;  //这里编译时报错。
            //System.out.println(new Test().new InnerTest().num);
            //System.out.println(Test.value);
        }
        public  static class InnerTest{
            public static int num = 10;
            public static int getNum(){
                return num;
            }
        }
    }


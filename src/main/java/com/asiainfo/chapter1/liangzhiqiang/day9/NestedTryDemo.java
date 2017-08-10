package com.asiainfo.chapter1.liangzhiqiang.day9;

/**
 * Created by 君不悔 on 2017/8/3.
 */
public class NestedTryDemo {
    public static void main(String[]args){
        String friends[]={"Kelly","Sandy","Jeck","Chery"};
        try {
            try {
                int num=friends.length/0;

            }catch (ArithmeticException e){
                e.printStackTrace();
            }
            for (int i=0;i<=4;i++)
            System.out.println(friends[i]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}

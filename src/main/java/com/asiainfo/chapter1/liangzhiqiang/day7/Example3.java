package com.asiainfo.chapter1.liangzhiqiang.day7;

/**
 * Created by 君不悔 on 2017/8/1.
 */
import java.util.Random;
public class Example3 {
    public static void main(String[]args){
        Random r=new Random();
        for (int x=0;x<10; x++){
            System.out.println(r.nextInt(100));//随机产生10个【0-100】之间的整数
        }
    }
}

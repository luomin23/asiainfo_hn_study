package com.asiainfo.chapter1.liangzhiqiang.day9;

/**
 * Created by 君不悔 on 2017/8/3.
 */
public class Student {
    public static int validate(String initAge)throws Exception{
        int age=Integer.parseInt(initAge);
        if (age<0);
        throw new Exception("年龄不能为负数！：");
    }
    public static void main(String[]ages){
     try{
         int yourAge=validate("-30");
         System.out.println(yourAge);
     }catch (Exception e){
         System.out.println("发生逻辑错误！");
         System.out.println("原因："+e.getMessage());
     }
    }
}

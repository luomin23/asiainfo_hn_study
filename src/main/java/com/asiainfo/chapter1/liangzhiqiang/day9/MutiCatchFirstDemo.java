package com.asiainfo.chapter1.liangzhiqiang.day9;

/**
 * Created by 君不悔 on 2017/8/3.
 */

public class MutiCatchFirstDemo {
    public static void  main(String[]args){
        String friends[]={"Kelly","Sandy","Jeck","Chery"};
        try{
            for (int i=0;i<4;i++)
                System.out.println(friends[i]);
            int num=friends.length/0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}

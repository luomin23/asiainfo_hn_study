package com.asiainfo.chapter1.luhui.luhui8;

/**
 * Created by 18237161432 on 2017/8/2.
 */
public class Exception {
    public static void main(String[] args) {
      /* 使用catch捕获可能产生的多个异常
       String friends[] = {"kelly", "sandy", "tony", "jeck"};
        try {
            for (int i = 0; i <= 4; i++)
                System.out.println(friends[i]);
            int num = friends.length / 0;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("这是个错误1");
        } catch (ArithmeticException e) {//运行时首先匹配到错误一，因此直接跳出try语句，因此错误二未被执行。
            System.out.println("这是个错误2");
        }*/



        /*使用try-catch捕获异常
        int i=0;
        String greetings[]={"Hello","NO,I","Why"};
        try{
            while(i<4){
                System.out.println(greetings[i]);
                i++;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("这是个错误");
        }*/


        //Exception异常类的应用
        int [] myInt=new int[10];
        for (int i=1;i<=10;i++){
            System.out.println(i);
            try{   myInt[i]=i;}

            //catch (ArrayIndexOutOfBoundsException e)
            catch(java.lang.Exception e){
                System.out.println("异常");
            }

        }

}}


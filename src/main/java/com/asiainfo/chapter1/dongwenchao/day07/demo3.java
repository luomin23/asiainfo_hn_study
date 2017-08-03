package com.asiainfo.chapter1.dongwenchao.day07;

/**
 * Created by 超超 on 2017/8/1 0001.
 */
public class demo3 {
    public static void main(String[]args){
       /* int a=6;
        int b=3;
        try {
            if (b==0)throw new ArithmeticException();
            System.out.println("结果为："+a/b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("程序正常结束");*/
        int a=0;
        String b[]={" Hello world !", " Hello World !! ",
                " HELLO WORLD !!!"};
        while(a<4){
            try{
                System.out.println(b[a++]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("数组下标越界异常");
            }finally {
                System.out.println("-------------");
            }
        }
    }
}

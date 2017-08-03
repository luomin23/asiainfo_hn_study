package com.asiainfo.chapter1.dongwenchao.day08;

/**
 * Created by 超超 on 2017/8/2 0002.
 */
public class demo1 {
    public static void main(String []args){
        int a[]={1,2,3,4,5};
        for (int i=0;i<6;i++){
            try{
                System.out.println("a["+i+"]/"+i+"="+a[i]/i);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("数组下标越界");
            }catch (ArithmeticException e){
                System.out.print("捕获到算术异常");
            }catch (Exception e){
                System.out.println("捕获"+e.getMessage()+"异常！");
            }finally{
                System.out.println("i="+i);
            }
        }

    }
}

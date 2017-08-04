package com.asiainfo.chapter1.Jiashihao.java84;

/**
 * Created by lenovo on 2017/8/4.
 */
public class ExceptionDemo {
    public static void main(String args[]){
        System.out.println("--计算开始--");
        int i = 0;
        int j = 0;
        try{
            String str1 = args[0];
            String str2 = args[1];
            i = Integer.parseInt(str1);
            j = Integer.parseInt(str2);
            int temp = i / j;
            System.out.println("俩个数字相处的结果："+ temp);
            System.out.println("------");
        }catch(ArithmeticException e) {
            System.out.println("算数异常：" + e);
        }catch(NumberFormatException e){
            System.out.println("数字转换异常：" + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常："+ e);
        }catch(Exception e){
            System.out.println("其他异常："+ e);
        }

            System.out.println("---计算结束---");
        }
    }

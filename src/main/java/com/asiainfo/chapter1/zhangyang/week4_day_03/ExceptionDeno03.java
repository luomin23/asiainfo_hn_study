package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by 11 on 2017/8/2.
 */
/*
try  catch 嵌套语句
 */
public class ExceptionDeno03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        int n = 0;
        try {
            try {
                System.out.println("请输入数组元素");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = scan.nextInt();
                }
                System.out.println("数组元素索引");
                n = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入类型不匹配异常信息：" + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("数组越界异常信息：" + e);
            }
            try {
                System.out.println("arr[" + n + "=" + arr[n]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("数组越界异常信息：" + e);
            }
            int m = arr[3] / arr[0];
            System.out.println("m=" + m);
        }catch (ArithmeticException e){
            System.out.println("算术异常信息："+e);
        }
        System.out.println("****程序结束****");
    }
}

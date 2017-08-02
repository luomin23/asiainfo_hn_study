package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by 11 on 2017/8/2.
 */
public class ExceptionDeno02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        try {
            System.out.println("****请输入数组元素****");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println("****请输入数组元素索引****");
            int n = scan.nextInt();
            System.out.println("arr[" + n + "]=" + arr[n]);
            int m = arr[3] / arr[0];
            System.out.println("m=" + m);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("异常信息：" + e);
        } catch (ArithmeticException e) {
            System.out.println("异常信息：" + e);
        } catch (InputMismatchException e) {
            System.out.println("异常信息：" + e);
        }
        System.out.println("****程序结束****");
    }
}

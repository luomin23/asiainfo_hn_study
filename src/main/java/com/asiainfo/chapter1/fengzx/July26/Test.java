package com.asiainfo.chapter1.fengzx.July26;

import java.util.Scanner;

/**
 * Created by fengzx on 2017/7/26.
 */

class Number{
    public int sum(int a,int b){
        return a+b;
    }
}
class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.print("请输入第二个数据：");
        int b = sc.nextInt();

        Number n = new Number();
        int result = n.sum(a,b);
        System.out.println("结果是："+result);
    }
}

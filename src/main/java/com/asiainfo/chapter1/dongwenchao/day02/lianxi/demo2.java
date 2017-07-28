package com.asiainfo.chapter1.dongwenchao.day02.lianxi;

import java.util.Scanner;

/**
 * Created by 超超 on 2017/7/27 0027.
 */
public class demo2 {
    public static void grade(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入该学员的分数（0-100）：");
        float x=scanner.nextFloat();
        if(x<0||x>100){
            System.out.println("请输入0到100以内的分数！");
            x=scanner.nextFloat();}
        if(x>=90){
            System.out.println("A");
        }else if(x>=80){
            System.out.println("B");
        }else if(x>=60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
    public static void main(String[] args){
        while (true)
        grade();
    }
}

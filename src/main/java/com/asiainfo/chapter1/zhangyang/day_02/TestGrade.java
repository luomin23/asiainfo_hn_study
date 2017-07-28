package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
        import java.util.Scanner;
public class TestGrade {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int grade = scan.nextInt();
        scan.close();
        if(grade>100||grade<0){
            System.out.println("请输入(0-100)成绩!");
        }else if(grade>=90){
            System.out.println("A");
        }else if(grade>=80){
            System.out.println("B");
        }else if(grade>=60){
            System.out.println("c");
        }else
            System.out.println("你需要再努力努力");
    }
}


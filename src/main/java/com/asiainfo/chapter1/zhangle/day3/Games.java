package com.asiainfo.chapter1.zhangle.day3;

import java.util.Scanner;

/**
 * Created by del on 2017/7/26.
 */
public class Games {
    Person p;
    public Games(Person p){
        this.p=p;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person p=new PersonUser();
        Games g=new Games(p);
        System.out.println("欢迎进入游戏：");
        System.out.println("请选择登录（输入1）/退出（输入0）：");
        int in=sc.nextInt();
        if(in==1){
            p.login();
            System.out.println("进入游戏");


        }else if(in==0){
            System.out.println("退出游戏");
        }

    }
}

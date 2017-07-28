package com.asiainfo.chapter1.zhangle.day4;

import java.util.Scanner;

/**
 * Created by del on 2017/7/27.
 */

interface Pattern {
    void select();
}

class Patterns implements Pattern {
    Vehicle v1 = new Gun();
    Vehicle v2=new Knife();
    Vehicle v3=new Pebble();
    public void select() {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i==3){
            System.out.println("复杂模式");
            v1.selectVehicle();
        }else if(i==2){
            System.out.println("一般模式");
            v2.selectVehicle();
        }else{
            System.out.println("简单模式");
            v3.selectVehicle();
        }
        System.out.println("你确定要进入此模式吗？是（输入1）/否（输入2）");
        int an=sc.nextInt();
        if(an==2){
            System.out.println("选择模式：入门（输入1）/一般（输入2）/复杂（输入3）");
            select();
        }else{
            System.out.println("游戏开始");
        }
    }

}
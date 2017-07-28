package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_04;

/**
 * Created by 11 on 2017/7/27.
 */
/*
验证enum中的values方法
 */
enum Directions02{
    SEAST,SOUTH,WEST,NORTH;
}
public class EnumDemo03 {
    public static void main(String[] args) {
        System.out.println("使用for循环输出:");
        for (int i = 0; i <Directions02.values().length ; i++) {
            System.out.print("  "+Directions02.values()[i]);
        }
        System.out.println("\n使用foreach输出：");
        for (Directions02 d2: Directions02.values()) {
            System.out.print("  "+d2);
        }
    }
}

package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_04;

/**
 * Created by 11 on 2017/7/27.
 */
enum Directions{
    EAST,SOUTH,WEST,NORTH;
}
public class EnumDemo01 {
    public static void main(String[] args) {
        Directions d = Directions.EAST;//取得枚举成员
        System.out.println("获取的枚举成员："+d);
    }
}

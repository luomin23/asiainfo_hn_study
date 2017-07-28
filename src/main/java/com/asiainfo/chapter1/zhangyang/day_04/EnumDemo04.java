package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_04;

/**
 * Created by 11 on 2017/7/27.
 */
/*
获取枚举成员的名称和索引
 */
enum Directions03{
    EAST,SOUTH,WEST,NORTH;
}
public class EnumDemo04 {
    public static void main(String[] args) {
        System.out.println("使用循环的方式输出：");
        for (int i = 0; i <Directions03.values().length ; i++) {
            System.out.println("索引位置："+Directions03.values()[i].ordinal()+
                    ",枚举成员名称："+Directions03.values()[i].name());
        }
    }
}

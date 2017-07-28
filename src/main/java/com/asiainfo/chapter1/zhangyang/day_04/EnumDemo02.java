package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_04;

/**
 * Created by 11 on 2017/7/27.
 */
/*
    在switch中使用枚举
 */
enum Directions01{
    EAST,SOUTH,WEST,NORTH;
}
public class EnumDemo02 {
    public static void main(String[] args) {
        Directions01 d = Directions01.EAST;
        show(d);
    }
    private static void show(Directions01 d) {
        switch (d){
            case EAST:
                System.out.println("你传递进来的枚举成员为：东");
                break;
            case SOUTH:
                System.out.println("你传递进来的枚举成员为：南");
                break;
            case WEST:
                System.out.println("你传递进来的枚举成员为：西");
                break;
            case NORTH:
                System.out.println("你传递进来的枚举成员为：北");
                break;
        }
    }
}

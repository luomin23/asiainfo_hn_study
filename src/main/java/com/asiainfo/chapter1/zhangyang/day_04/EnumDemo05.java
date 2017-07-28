package com.asiainfo.chapter1.zhangyang.day_04;

/**
 * Created by 11 on 2017/7/28.
 */
interface EnumInterface{
   void show();
}
enum Directions04 implements EnumInterface{
    EAST(){
        public void show(){
            System.out.println("此枚举成员为:东" );
        }
    },
    SOUTH(){
        public void show(){
            System.out.println("此枚举成员为:南" );
        }
    },
WEST(){
public void show(){
        System.out.println("此枚举成员为:西" );
        }
    },
    NORTH(){
public void show(){
        System.out.println("此枚举成员为:北" );
        }
    }
}
public class EnumDemo05 {
    public static void main(String[] args) {
        for (Directions04 d:Directions04.values()) {
            d.show();
        }
    }
}

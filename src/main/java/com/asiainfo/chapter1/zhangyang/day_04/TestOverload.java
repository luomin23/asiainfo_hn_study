package com.asiainfo.chapter1.zhangyang.day_04;

/**
 * Created by 11 on 2017/7/27.
 */
/*
每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
 */
class Math{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }
}
public class TestOverload{
    public static void main(String[] args) {
        Math math = new Math();
        int result =math.add(4,5,6);
        System.out.println(result);
    }
}

package com.asiainfo.chapter1.zhangyang.day_05;

/**
 * Created by 11 on 2017/7/28.
 */
/*
测试对象数组
对象数组的静态初始化
 */
class School01 {
    private String name;

    public School01() {

    }

    public School01(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ObjectArrayDemo02 {
    public static void main(String[] args) {
        School01 school01[] = {new School01("中国人民大学"),
                new School01("清华大学"),
                new School01("北京大学"),
                new School01("中国地质大学"),};
        System.out.println("使用for循环输出：");
        for (int i = 0; i <school01.length ; i++) {
            System.out.println(school01[i].getName()+" ");
        }
    }
}

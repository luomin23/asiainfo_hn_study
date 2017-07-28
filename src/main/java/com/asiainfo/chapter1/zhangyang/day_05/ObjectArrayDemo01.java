package com.asiainfo.chapter1.zhangyang.day_05;

import java.security.PrivateKey;

/**
 * Created by 11 on 2017/7/28.
 */
/*
测试对象数组
对象数组的动态初始化
 */
class School {
    private String name;

    public School() {

    }

    public School(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
    public class ObjectArrayDemo01 {
        public static void main(String[] args) {
           School school [] = new School[4];
            school[0] = new School("中国人民大学");
            school[1] = new School("清华大学");
            school[2] = new School("北京大学");
            school[3] = new School("中国地质大学");
            System.out.print("使用for循环输出：");
            for (int i = 0; i < school.length; i++) {
                System.out.println(school[i].getName() + "  ");
            }
        }
    }




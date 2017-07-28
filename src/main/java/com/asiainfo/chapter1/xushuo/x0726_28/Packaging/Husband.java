package com.asiainfo.chapter1.xushuo.x0726_28.Packaging;

/**
 * Created by root on 2017/7/28.
 * 对属性的封装
 * 一个人的姓名、性别、年龄、妻子都是这个人的私有属性
 */
public class Husband {
    private String name;
    private String sex;
//    private int age;
    private String age; /*改成String类型*/
    private Wife wife;
//    setter()、getter()是该对象对外开发的接口

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(int age) {
//        this.age = age;修改为String类型
        this.age = String.valueOf(age);
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}

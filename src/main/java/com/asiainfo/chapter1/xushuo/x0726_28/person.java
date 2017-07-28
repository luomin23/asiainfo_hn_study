package com.asiainfo.chapter1.xushuo.x0726_28;

/**
 * Created by root on 2017/7/26.
 * 封装
 */
public class person {
    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public String getIdNum() {
        return idNum;
    }
    public void setAge(int newAge) {
        age=newAge;
    }
    public void setName(String newName) {
        name=newName;
    }
    public void setIdNum(String newId) {
        idNum=newId;
//        public方法是外部类访问该类成员变量的入口。
//        通常情况下，这些方法被称为getter和setter方法。
//        因此，任何要访问类中私有成员变量的类都要通过这些getter和setter方法。
    }
}

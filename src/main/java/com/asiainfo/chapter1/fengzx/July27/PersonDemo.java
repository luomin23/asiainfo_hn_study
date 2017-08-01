package com.asiainfo.chapter1.fengzx.July27;

/**
 * Created by fengzx on 2017/7/27.
 */

class Preson{
    String name;
    int age;
    //String grand;
    static String grand;

    public Preson(){}

    public Preson(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Preson(String name,int age,String grand){
        this.name = name;
        this.age = age;
        this.grand = grand;
    }

    public void show(){
        System.out.println("姓名："+name+"  年龄："+age+"  年级："+grand);
    }
}

public class PersonDemo {
    public static void main(String[] args){
        Preson p1 = new Preson();
        p1.show();

        Preson p2 = new Preson("张三",22,"14级");
        p2.show();
        Preson p3 = new Preson("李四",21);
        p3.show();
        Preson p4 = new Preson("王五",20);
        p4.show();

        System.out.println("--------------------------------");
        p3.grand = "15级";
        p2.show();
        p3.show();
        p4.show();
    }
}

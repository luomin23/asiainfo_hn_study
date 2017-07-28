package com.asiainfo.chapter1.dongwenchao.day03;
import java.io.*;
/**
 * Created by 超超 on 2017/7/26 0026.
 */
public class demo2 {
    String name;
    int age;
    String designation;
    double salary;
    public demo2(String name){
        this.name = name;
        System.out.println("名字:"+ name );
    }

    public demo2() {//构造器
    }
    public demo2(int empAge){
        this.age =  empAge;
        System.out.println("年龄:" + age );
    }
    public void empDesignation(String empDesig){
        designation = empDesig;
        System.out.println("职位:" + designation );
    }
    public void empSalary(double empSalary){
        salary = empSalary;System.out.println("薪水:" + salary);

    }
    public static void main(String[] args){
        demo2 a=new demo2("董稳超");
        demo2 a1=new demo2(15);
        /*a.empAge(15);*/
        a.empDesignation("开发");
        a.empSalary(4500);
    }
}


package com.asiainfo.chapter1.zhangyang.day_05;

/**
 * Created by 11 on 2017/7/28.
 */
/*
向下转型
 */
class Father{
    public void tell(){
        System.out.println("父类的tell方法");
   }
    public void say(){
        System.out.println("父类的say方法");
    }
}
class Son extends Father{
    @Override
    public void tell() {
        System.out.println("子类的tell方法");
   }
    public void print(){
        System.out.println("子类的print方法");
    }
}
public class DownCastDemo01 {
    public static void main(String[] args) {
       Father father = new Son();
        Son son = (Son)father;
        //father.say();
       //father.tell();
        son.print();
        son.tell();
        son.say();
    }
}

package com.asiainfo.chapter1.liangzhiqiang.day3;

/**
 * Created by 君不悔 on 2017/7/26.
 */
class Person {
public void fun1(){
    System.out.println("1.Person{fun1()}");
}
    public void fun2(){
        System.out.println("2.Person{fun2()}");
    }
}
class Student extends Person//继承了父类Person，自然继承了方法fun1，fun2
{
    public void fun1()//覆盖了父类中的方法fun1（）
    {
        System.out.println("3.Student{fun1()}");
    }
public  void fun3(){
    System.out.println("4.Student{fun3()}");
}
}
class TestjavaDemo2{
    public static void main(String[]args){
        Person p=new Student();//让父类知道有这么一个子类
    Student s=(Student)p;//将p对象向下转型
        p.fun1();
        p.fun2();
    }
}

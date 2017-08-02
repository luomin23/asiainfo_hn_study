package com.asiainfo.chapter1.fengzx.July28;

/**
 * Created by fengzx on 2017/7/28.
 */

class Student{
    int age = 30;
}

public class StudentDemo {

    public void show(int x){
        x = 20;
        System.out.println(x);
    }

    public void show2(final int x){
        //x = 30;
        System.out.println(x);
    }

    public void show3(Student s){
        s.age = 10;
        System.out.println(s.age);
    }

    public void show4(final Student s){
        s.age = 20;
        System.out.println(s.age);
    }

    public static void main(String[] args){
        StudentDemo sd = new StudentDemo();

        int x = 10;

        sd.show(x);
        sd.show2(x);

        sd.show3(new Student());
        sd.show4(new Student());
    }
}

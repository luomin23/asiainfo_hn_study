package com.asiainfo.chapter1.fengzx.July26;

/**
 * Created by fengzx on 2017/7/26.
 */
class Student {
    String name;
    int age;

    public void study(){
        System.out.println("好好学习，天天向上。");
    }

    public void sleep(){
        System.out.println("好好睡觉。");
    }

    public void eat(){
        System.out.println("好好吃饭。");
    }
}

class StudentDemo{
        public static void main(String[] args){
            Student s = new Student();
            System.out.println(s.name+"------"+s.age);  //null------0

            s.name = "fengzx";
            s.age = 20;
            System.out.println(s.name+"------"+s.age);  //fengzx------20

            s.study();
            s.sleep();
            s.eat();
        }
}

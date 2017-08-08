package com.asiainfo.chapter1.fengzx.Aug07;

/**
 * Created by fengzx on 2017/8/7.
 */
public class Person {
    private String name;
    int age;
    public String address;

    public Person(){
        super();
    }

    Person(String name){
        super();
        this.name = name;
    }

    public Person(String name,int age,String address){
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void show(){
        System.out.println("show");
    }

    public void show2(String s){
        System.out.println(s);
    }

    public String show3(){
        return "hello";
    }

    public String show4(String name,int age){
        return name+"==="+age;
    }

    private void function(){
        System.out.println("function");
    }

    @Override
    public String toString() {
        return "Person [name="+name+", age="+age+", address="+address+"]";
    }
}

package com.asiainfo.chapter1.dongwenchao.day04;

/**
 * Created by 超超 on 2017/7/27 0027.
 */
class A{
    public void print(){
        System.out.println("I am class A.");
    }
    public void print(String name){
        System.out.println("Hello "+name+", I am class A.");
    }}
class Aa extends A{
    public void printInfo(){
        super.print("SubClass");
    }
    public static void main(String args[]){
        A a = new A();
        a.print();
        Aa aa= new Aa();
        aa.printInfo();
    }
}

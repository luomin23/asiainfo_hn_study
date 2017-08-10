package com.asiainfo.chapter1.luhui.luhui5;

/**
 * Created by 18237161432 on 2017/7/28.
 */
public class AbstractTest {

}
   abstract class A{
       public int age =5;
       public abstract void idea();
       public abstract void think();
     /* public void A(){
           this.age=age;
       }*/
       public void run(){
           System.out.println("你再跑");
       }
   }
   class B extends A {
       int age =9;

       public void idea(){
           System.out.println("text");
       }
       public void think(){
           System.out.println("qwe"+super.age);//
       }

public static void main(String [] args){
    B b=new B();

    b.run();
    b.idea();
    b.think();
    ;
    System.out.println(b.age);

}}

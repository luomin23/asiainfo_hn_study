package com.asiainfo.chapter1.luhui.luhui5;

/**
 * Created by 18237161432 on 2017/7/28.
 */

interface Animal{
    void run();
    void eat();
}
 class Fish implements Animal{
    public void run(){
        System.out.println("鱼会游泳");
    }
     public void eat(){
         System.out.println("鱼吃虫子");
     }

}
abstract class LandAnimal implements Animal{//一个类使用接口，如果没有实现接口里的所有方法，那么这个类要声明为抽象类。
    public void run(){
        System.out.println("陆地动物可以跑");
    }
    public void sleep(){
        System.out.println("所有动物都睡觉");
    }

}
class Tiger extends LandAnimal{//子类继承抽象类，需要重写抽象类的所有方法，并且父类关于接口没有实现的方法，子类也要进行重写。
    public void run(){
        System.out.println("老虎是陆地动物，可以跑");
    }
    public void sleep(){
        System.out.println("老虎会睡觉");
    }
    public void eat(){
        System.out.println("老虎吃肉");
    }
}
public class interfacetest {
     public static void main(String [] args){
         Fish F =new Fish();
         F.run();
         F.eat();
         Tiger T=new Tiger();
         T.eat();
         T.run();
         T.sleep();
     }

}


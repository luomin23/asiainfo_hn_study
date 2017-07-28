package com.asiainfo.chapter1.zhangle.day3;

/**
 * Created by del on 2017/7/26.
 */
public class AnimalGroup {
    public static void show(Animal a){
        a.eat();
        if(a instanceof Cat){
            ((Cat) a).play();
        }else{
            ((Dog) a).play();

        }
    }
    public static void main(String[] args) {
        /*注意：
        * 当使用多态方式调用方法时，首先检查父类中是否有该方法，
        * 如果没有，则编译错误；如果有，再去调用子类的同名方法。
        * */
        Animal a1=new Cat();
        System.out.print("cat:");
        a1.eat();   //调用cat的eat（）方法 不能调用cat的play（）
        Cat c=(Cat) a1;
        c.play();   //向下转型 可以调用Cat的play（）方法
        Animal a2=new Dog();
        System.out.print("dog:");
        a2.eat();
        System.out.println("show cat:");
        show(new Cat());
        System.out.println("show dog:");
        show(new Dog());

    }
}

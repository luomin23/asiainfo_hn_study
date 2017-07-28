package com.asiainfo.chapter1.fengzx.July26;

/**
 * Created by fengzx on 2017/7/26.
 */
class Car{
    String brand;
    String color;
    int price;

    public void run(){
        System.out.println("Running!");
    }

    public void stop(){
        System.out.println("STOP!");
    }
}
class CarDemo {
    public static void main(String[] args){
        Car c = new Car();

        Car c2 = new Car();
        System.out.println(c==c2);  //false

        Car c3 = c;

        System.out.println(c==c3);  //true

        c3.brand = "BMW";
        c3.color = "白色";
        c3.price = 29999;
        System.out.println(c.brand+"-----"+c.color+"-----"+c.price); //BMW-----白色-----29999

    }
}

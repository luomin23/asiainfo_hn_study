package com.asiainfo.chapter1.liangzhiqiang.day11;

/**
 * Created by 君不悔 on 2017/8/7.
 */
class Car{
   private String carName;
    public Car(String carName){
        this.carName=carName;
    }
    public void show(){
        System.out.println("我是"+carName+",具有基本功能");

    }
}
class RadarCar{
    public Car myCar;
    public RadarCar(Car myCar){
        this.myCar=myCar;
    }
    public void show(){
        myCar.show();
        System.out.println("具有倒车雷达功能");
    }
}
public class Cars{
    public static void main(String[]args){
        Car benz=new Car("benz");
        System.out.println("----------包装前---------");
        benz.show();
        RadarCar decoratedCar_benz=new RadarCar(benz);
        System.out.println("-----------包装后---------");
        decoratedCar_benz.show();
    }
}

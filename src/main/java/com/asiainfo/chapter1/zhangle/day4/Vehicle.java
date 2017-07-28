package com.asiainfo.chapter1.zhangle.day4;

/**
 * Created by del on 2017/7/27.
 */
abstract class Vehicle {
    abstract void selectVehicle();
}

class Gun extends Vehicle {
    public void selectVehicle() {
        System.out.println("武器是：枪");

    }
}
class Knife extends Vehicle {

    void selectVehicle() {
        System.out.println("武器是：匕首");
    }
}

class Pebble extends Vehicle {

    void selectVehicle() {
        System.out.println("武器是：石子");
    }
}
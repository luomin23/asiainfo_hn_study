package com.asiainfo.chapter1.fengzx.Aug08;

/**
 * Created by fengzx on 2017/8/8.
 */
public class CarDemo {
    public static void main(String[] args) {
        Car c1 = CarFactory.getCar("奥拓");
        c1.start();
        c1.stop();

        Car c2 = CarFactory.getCar("奥迪");
        c2.start();
        c2.stop();

        Car c3 = CarFactory.getCar("BMW");
        c3.start();
        c3.stop();
    }
}

package com.asiainfo.chapter1.luomin.pattern.proxy.jdk;

/**
 * 电能车类，实现Rechargable，Vehicle接口
 *
 * @author Luoo
 * @create 2017-08-25 9:43
 */

public class ElectricCar implements Rechargable, Vehicle {

    @Override
    public void recharge() {
        System.out.println("Electric Car is Recharging...");
    }

    @Override
    public void drive() {
        System.out.println("Electric Car is Moving silently...");
    }
}

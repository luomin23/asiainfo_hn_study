package com.asiainfo.chapter1.zhangle.day3;

/**
 * Created by del on 2017/7/26.
 */
interface Vehicle {
    void selectVehicle();
}
class Gun implements Vehicle{
    public void selectVehicle() {
        System.out.println("武器是：枪");

    }
    public static void main(String[] args){
        Gun g = new Gun();
        g.selectVehicle();

    }
}
package com.asiainfo.chapter1.luhui.luhui4;

/**
 * Created by 18237161432 on 2017/7/27.
 */
public class extend {
    void vehicleRun(){
        System.out.println("汽车在行驶");
    }

 static class Truck extends extend{
void TruckRun(){
    System.out.println("卡车在行驶");
}
}
public static class SmallTruck extends Truck {
    void smallTruck() {
        System.out.println("火车在行驶");
    }
}
public static void main (String [] args) {
    SmallTruck smallTruck = new SmallTruck();
    smallTruck.vehicleRun();
    smallTruck.TruckRun();
    smallTruck.smallTruck();
}}

package com.asiainfo.chapter1.fengzx.Aug08;

/**
 * Created by fengzx on 2017/8/8.
 */
public class CarFactory {
    private CarFactory(){}

    public static Car getCar(String type){
        return new Car(type);
    }
}

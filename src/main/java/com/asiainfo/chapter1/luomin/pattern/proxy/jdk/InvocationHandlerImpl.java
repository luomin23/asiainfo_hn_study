package com.asiainfo.chapter1.luomin.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Luoo
 * @create 2017-08-25 9:44
 */
public class InvocationHandlerImpl implements InvocationHandler {

    private ElectricCar car;

    public InvocationHandlerImpl(ElectricCar car) {
        this.car = car;
    }

    @Override
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
        System.out.println("You are going to invoke " + paramMethod.getName() + " ...");
        paramMethod.invoke(car, null);
        System.out.println(paramMethod.getName() + " invocation Has Been finished...");
        return null;
    }

}

package com.asiainfo.chapter1.luomin.reflex.proxy1;

import java.lang.reflect.Proxy;

/**
 * @author Luoo
 * @create 2017-08-24 14:19
 */

public class MyProxyFactory {
    //为制定的target生成动态代理对象
    public static Object getProxy(Object target) throws Exception {
        //创建一个MyInvocationHandler对象
        MyInvocationHandler handler = new MyInvocationHandler();
        //为MyInvocationHandler设置target对象
        handler.setTarget(target);
        //创建并返回一个动态代理
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);
    }
}

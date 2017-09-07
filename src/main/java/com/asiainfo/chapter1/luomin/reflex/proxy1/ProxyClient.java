package com.asiainfo.chapter1.luomin.reflex.proxy1;

/**
 * @author Luoo
 * @create 2017-08-24 14:21
 */

public class ProxyClient {
    public static void main(String[] args) throws Exception {
        //创建一个原始的GunDog对象，作为target
        Dog target = new GunDog();
        //以制定的target来创建动态代理对象
        Dog dog = (Dog) MyProxyFactory.getProxy(target);
        dog.info();
        dog.run();
    }
}

package com.asiainfo.chapter1.luomin.pattern.singleton;


public class EagerSingleton {

    //类加载的时候就创建了自身的实例对象--饿汉式（空间换取时间）
    public static EagerSingleton eagerSingleton = new EagerSingleton();

    /**
     * 显示的私有构造方法，防止其他类创建本类实例
     */
    private EagerSingleton() {

    }

    /**
     * 静态工厂方法，其他类通过调用该方法来获取本类的实例对象
     */
    public static EagerSingleton getEagerSingleton() {
        return eagerSingleton;
    }
}

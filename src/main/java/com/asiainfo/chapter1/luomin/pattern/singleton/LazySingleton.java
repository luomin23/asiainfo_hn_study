package com.asiainfo.chapter1.luomin.pattern.singleton;


public class LazySingleton {

    //类加载的时候并没有创建自身实例化对象
    public static LazySingleton lazySingleton = null;

    /**
     * 显示的私有构造方法，防止其他类创建本类实例
     */
    private LazySingleton() {

    }

    /**
     * 静态工厂方法，其他类通过调用该方法来获取本类的实例对象
     */
    public static synchronized LazySingleton getLazySingleton() {
        //第一次被调用的时候创建自身实例对象
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
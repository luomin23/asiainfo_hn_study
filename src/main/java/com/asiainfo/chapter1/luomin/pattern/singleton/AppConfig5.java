package com.asiainfo.chapter1.luomin.pattern.singleton;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 饿汉式存在着占用资源的问题，懒汉式存在着线程安全的问题
 * 即实现了延迟加载，又线程安全
 * 静态内部类的使用，静态内部类的静态变量只有在静态内部类被使用的时候才会加载。
 */
public class AppConfig5 {

    private String id;
    private String name;

    /**
     * 私有化构造方法
     */
    private AppConfig5() {
        //调用读取配置文件的方法
        readConfig();
    }

    /**
     * 定义一个方法来为客户端提供AppConfig类的实例
     *
     * @return 一个AppConfig的实例
     */
    public static AppConfig5 getInstance() {
        return AppConfig5Holder.instance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 读取配置文件，把配置文件中的内容读出来设置到属性上
     */
    private void readConfig() {
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream("AppConfig.properties"));
            p.load(in);
            //把配置文件中的内容读出来设置到属性上
            this.id = p.getProperty("id");
            this.name = p.getProperty("name");
        } catch (IOException e) {
            System.out.println("装载配置文件出错了，具体堆栈信息如下：");
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //静态内部类在第一次使用的时候被装载
    private static class AppConfig5Holder {
        private static AppConfig5 instance = new AppConfig5();
    }

}

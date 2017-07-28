package com.asiainfo.chapter1.Jiashihao.leiduixiang;

/**
 * Created by lenovo on 2017/7/26.
 */
class Person2{
    private String name;
    private int age;
    private static String  country = "A城";                //定义static属性
    public static void setCountry(String  c){       //定义static方法
        country =c;
    }
    public Person2(String name ,int age){      //构造方法
        this.name = name;
        this.age=age;
    }
    public  void info(){
        System.out.println("姓名："+this.name+",年龄：" + this.age+",城市："+ country);
    }
    public static String getCountry(){                    //取得static属性
        return country;
    }
};
public class STATIC {
    public static void main(String args[]){
        Person2 p1 = new Person2("张一",20);                //实例化对象
        Person2 p2 = new Person2("张二",21);
        Person2 p3 = new Person2("张三",22);
        System.out.println("---修改前---");
        p1.info();
        p2.info();
        p3.info();
        System.out.println("---修改后---");
        Person2.setCountry("B城");
        p1.info();
        p2.info();
        p3.info();
    }
};

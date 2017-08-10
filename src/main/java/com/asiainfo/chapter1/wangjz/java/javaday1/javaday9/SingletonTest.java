package com.asiainfo.chapter1.wangjz.java.javaday1.javaday9;

/**
 * Created by wjz123456 on 2017/8/7.
 */
public class SingletonTest {
    String name=null;
    private SingletonTest(){

    }
    private static volatile SingletonTest instance=null;
    public static SingletonTest getInstance(){
        if(instance==null){
            synchronized ((SingletonTest.class)){
                if (instance==null){
                    instance=new SingletonTest();
                }
            }
        }
        return instance;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void printInfo(){
        System.out.println("this name is"+name);
    }

    public static void main(String[] args) {
        SingletonTest s1=SingletonTest.getInstance();
        s1.setName("wjz");
        s1.printInfo();
        SingletonTest s2=getInstance();
        s2.setName("100010");
        s2.printInfo();
        if (s1.equals(s2)){
            System.out.println("创建的是同一个实例");
        }else{
            System.out.println("创建的不是同一个实例");
        }

    }
}

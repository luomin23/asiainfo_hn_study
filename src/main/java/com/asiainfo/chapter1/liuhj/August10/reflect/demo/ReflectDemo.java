package com.asiainfo.chapter1.liuhj.August10.reflect.demo;


/*
*    JAVA反射机制是在运行状态中，对于任意一个类（class文件），都能够知道这个类的所有属性和方法；
*    对于任意一个对象，都能够调用它的任意一个方法和属性；
*    这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。
*
*
*    动态获取类中信息，就是java的反射。
*    可以理解为对类的解刨。
*
*
*
*    要想要对字节码文件进行解刨，必须要有字节码文件对象。
*    如何获取字节码文件对象呢？
*
*
*
*
*
*
* */



public class ReflectDemo {
     public ReflectDemo(){

     }

    public static void main(String[] args) throws ClassNotFoundException {
        getClassObject_3();
    }


        /*
    * 获取字节码对象的方式：
    *  只要通过给定的类的字符串名称就可以获取该类，更为扩展。
    *  可是用Class类中的方法完成。
    *  该方法就是forName
    *这种方式只要有名称即可，更为方便，扩张性更强
    *
    * */
    public static void getClassObject_3()  throws ClassNotFoundException{

        String className ="com.asiainfo.chapter1.liuhj.August10.bean.Person";          //注意此处写上包名否则会抛文件找不到异常
          Class clazz   =Class.forName(className);
          System.out.println(clazz);


    }





}



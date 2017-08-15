package com.asiainfo.chapter1.dongwenchao.day11;

import java.lang.reflect.*;

/**
 * Created by 超超 on 2017/8/6 0006.
 */
public class Main {
    public static void demo1(){
        Person per = new Person();
        System.out.println("demo7：包名 ："+per.getClass().getPackage().getName()+","+"完整类名："+per.getClass().getName());
    }
    public static void demo2(){
        Class<?> class1 = null;
        Class<?> class2 = null;
        /*try {
            class1=Class.forName("com.asiainfo.chapter1.liuwy.five.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        class2=Person.class;
        /*System.out.println("demo4:(写法1) 包名: " + class1.getPackage().getName() + "，"
                + "完整类名: " + class1.getName());*/
        System.out.println("demo4:(写法2) 包名: " + class2.getPackage().getName() + "，"
                + "完整类名: " + class2.getName());
    }
    public static void demo3() throws IllegalAccessException, InstantiationException {
        Class<?> class1 = null;
        class1=Person.class;
            //由于这里不能带参数，所以你要实例化的这个类Person，一定要有无参构造函数哈～
        Person per = new Person();//跟后面的代码等同Person per = (Person) class1.newInstance();
        per.setAge(20);
        per.setName("LeeFeng");
        System.out.println("demo3: " + per.getName() + " : " + per.getAge());
    }
    public static void demo4() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> class1 = null;
        Person person1 = null;
        Person person2 = null;
        class1=Person.class;
        //得到一系列构造函数集合
        Constructor<?>[] constructors = class1.getConstructors();
        person1 = (Person) constructors[0].newInstance();
        person1.setAge(30);
        person1.setName("leeFeng");
        person2 = (Person) constructors[1].newInstance(20,"leeFeng");
        System.out.println("Demo4: " + person1.getName() + " : " + person1.getAge()
                + "  ,   " + person2.getName() + " : " + person2.getAge()
        );
    }
    public static void demo5() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> class1 = null;
        class1=Person.class;
        Object obj=class1.newInstance();
        Field f=class1.getDeclaredField("name");
        f.setAccessible(true);
        Field f1=class1.getDeclaredField("age");
        f1.setAccessible(true);
        f.set(obj , "董稳超");
        f1.set(obj , 20);
        System.out.println("Demo5: 修改属性之后得到属性变量的值：" + f.get(obj)+"\t"+f1.get(obj));
    }
    public static void demo6(){
        Class<?> class1=null;
        class1=Person.class;
        //取得父类名称
        Class<?> sup=class1.getSuperclass();
        System.out.println("Demo6:  SuperMan类的父类名: " + sup.getName());
        System.out.println("===============================================");
        Field[] fields = class1.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println("类中的成员: " + fields[i]);
        }
        System.out.println("===============================================");
        Class<?> class2=null;
        class2=SuperMan.class;
        Method[] fie=class2.getDeclaredMethods();
        for (int i = 0; i < fie.length; i++) {
            System.out.println("类中的方法: " + fie[i]);
            System.out.println("函数名字:"+fie[i].getName());
            System.out.println("函数返回类型:"+fie[i].getReturnType());
            System.out.println("函数访问修饰符:"+ Modifier.toString(fie[i].getModifiers()));
            System.out.println("函数代码写法:"+fie[i]);
        }
        System.out.println("===============================================");
        //取得类实现的接口,因为接口类也属于Class,所以得到接口中的方法也是一样的方法得到哈
        Class<?> intf[]=class2.getInterfaces();
        for (int i=0;i<intf.length;i++){
            System.out.println("实现的接口类名: " + intf[i].getName() );
        }
    }
    public static void demo7() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> class1=null;
        class1=SuperMan.class;
        System.out.println("Demo7:调用无参方法fly()：");
        Method Me=class1.getMethod("fly");
        Me.invoke(class1.newInstance());
        System.out.println("调用有参方法walk(int m)：");
        Me = class1.getMethod("walk",int.class);
        Me.invoke(class1.newInstance(),0);
    }
    public static void demo8(){
        Class<?> class1=null;
        class1=SuperMan.class;
        String Sna=class1.getClassLoader().getClass().getName();
        System.out.println("类加载器的名字："+Sna);
    }
    public static void main(String[]args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Main a=new Main();
       // 通过Java反射机制得到类的包名和类名
        a.demo1();
        //验证所有的类都是Class类的实例对象
        a.demo2();
        //通过Java反射机制，用Class 创建类对象[这也就是反射存在的意义所在]
        try {
            a.demo3();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        // 通过Java反射机制得到一个类的构造函数，并实现创建带参实例对象
        try {
            a.demo4();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
       // 通过Java反射机制操作成员变量, set 和 get
        try {
            a.demo5();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        // 通过Java反射机制得到类的一些属性： 继承的接口，父类，函数信息，成员信息，类型等
        a.demo6();
        //Demo7: 通过Java反射机制调用类方法
        try {
            a.demo7();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        //通过Java反射机制得到类加载器信息
        a.demo8();
    }
}

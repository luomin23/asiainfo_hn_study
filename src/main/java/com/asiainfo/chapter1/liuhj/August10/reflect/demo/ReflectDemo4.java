package com.asiainfo.chapter1.liuhj.August10.reflect.demo;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public  class ReflectDemo4 {
    public ReflectDemo4(){


    }

    public static void main(String[] args) throws Exception {
        getMethodDemo();
    }

    private static void getMethodDemo() throws Exception {
         Class clazz= Class.forName("com.asiainfo.chapter1.liuhj.August10.bean.Person");
      Method method =clazz.getMethod("show",null);//获取空参数一般方法,show为方法名，null表示无参函数
      //有了方法了，正常情况下是用对象调用方法。 类比正常情况
             //Object obj =clazz.newInstance();  运行了但是结果是null和0  如果想要初始化参数，就new有参数的对象
         Constructor  constructor       =clazz.getConstructor(int.class, String.class);
             Object obj = constructor.newInstance(37,"小明");
             method.invoke(obj,null);//即需要所属对象又需要实际参数，没有实参所以选择空

//心的体会： 拿到字节码文件对象后只能用其创建无参构造函数，如果想让其对象已创建带着参数需要调用构造器

    }


}

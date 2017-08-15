package com.asiainfo.chapter1.zhangle.August2nd;

import com.asiainfo.chapter1.zhangle.day5.Gener;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by del on 2017/8/2.
 * 反射机制的作用：
 *1，反编译：.class-->.java
 *2,通过反射机制访问java对象的属性，方法，构造方法等；
 */
public class ReflexJava {

    /*创建对象*/
    public static void creat() throws IllegalAccessException, InstantiationException {
        //先获取SetJava的class类对象
        Class c=SetJava.class;
        /*创建对象
        调用SetJava类的无参构造函数
         会抛出IllegalAccessException（非法访问异常）
         */
        Object o=c.newInstance();
        System.out.println("对象:"+o);
        //获取所有的属性
        Field[] f=c.getDeclaredFields();
        //定义可边长字符串 存储属性
        StringBuffer s=new StringBuffer();
        /*
        * getModifiers()得到修饰符
        * getModifiers()得到类/属性的简写名称
        * 通过追加的方法，将每个属性拼接到此字符串中
        * */
        s.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
        System.out.println("类 + 属性:");
        for(Field fs:f){
            s.append("\t");//空格
            s.append(Modifier.toString(fs.getModifiers())+" ");
            s.append(fs.getType().getSimpleName() + " ");
            s.append(fs.getName()+";\n");//属性的名字+回车
        }
        s.append("}");
        System.out.println(s);

    }

    public static void main(String[] args) throws Exception {
        /*方法一：
        获取类 以及 需要抛出ClassNotFoundException异常
        注意使用forName获取类时需要使用全路径
        */
        try{
            Class c= Class.forName("com.asiainfo.chapter1.zhangle.August2nd.SetJava");
            System.out.println(c);
        }catch (ClassNotFoundException e1){
            System.out.println("无法获取类");
        }

        /*方法二获取类*/
        Class c1= SetJava.class;
        System.out.println("方法二:"+c1);
        /*方法三 获取类*/
        SetJava s=new SetJava();
        Class c2=s.getClass();
        System.out.println("方法三:"+c2);

        creat();

    }



}

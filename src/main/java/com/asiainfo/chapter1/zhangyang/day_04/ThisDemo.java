package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_04;

/**
 * Created by 11 on 2017/7/27.
 */
/*
使用this调用无参构造方法时候必须放在构造方法的首行
 */
class This {
    private String name;
    private String sex;
    private int age;
    public This(){//定义一个无参构造方法并传入年龄21
        this.age=21;
    }
    public This(String name){
        this();//使用this调用构造方法
        this.name=name;//另成员变量name等于传入参数name
    }
    public This (String name,String sex){
        this(name);
        this.sex="男";
    }
    public void say(){
        System.out.println("我的名字叫"+name+",今年"+age+"岁,是一个"+sex+"孩");
    }
}
public class ThisDemo{
    public static void main(String[] args) {
        This t1 = new This("小强","男");
        t1.say();
    }
}
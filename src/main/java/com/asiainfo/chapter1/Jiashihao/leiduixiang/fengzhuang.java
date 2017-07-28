package com.asiainfo.chapter1.Jiashihao.leiduixiang;

/**
 * Created by lenovo on 2017/7/26.
 */
class  Person{
    private String name;    //声明姓名属性
    private int age;       //声明年龄属性
    public void tell(){     //取得信息的方法
        System.out.println("姓名："+ this.getName() + ",年龄：" + this.getAge());
    }
    public String getName(){
        return name;      //取得姓名
    }
public void setName(String n){    // 设置姓名
    name=n;
}
    public int getAge(){      //取得年龄
        return age;
    }
    public void setAge(int a){    //设置年龄
        if(a >= 0 && a< 145){       //在此处加上验证代码
            age=a;
        }
    }
}
public class fengzhuang {
    public static void main(String args[]){
        Person per = new Person();     //声明并实例化对象
        per.setName("张三");           //调用setter设置姓名
        per.setAge(-30);                //setter设置年龄
        per.tell();                      //输出信息
    }
}

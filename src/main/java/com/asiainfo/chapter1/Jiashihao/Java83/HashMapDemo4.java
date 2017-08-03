package com.asiainfo.chapter1.Jiashihao.Java83;

/**
 * Created by lenovo on 2017/8/3.
 */
import java.util.HashMap;
import java.util.Map;
class People{
    //定义People类
    private String name;
    //定义name属性
    private int age;
    //定义age属性
    public People(String name,int age){
        //通过构造方法为属性赋值
        this.name = name;
        //为name属性赋值
        this.age = age;
    //为age属性赋值
    }
public String toString(){
    //覆写toString（）方法
    return "姓名："+this.name+"年龄："+this.age;
}
}
public class HashMapDemo4 {
    public static void main(String args[]){
        Map<People,String> map = null;
       //声明Map对象，制定泛型类型
        map = new HashMap<People,String>();
        //实例化Map对象
        People per = new People("JSH",30);
      //实例化People对象
        map.put(per,"jsh");
        //增加内容
        System.out.println(map.get(per));
        //查找内容
    }
}

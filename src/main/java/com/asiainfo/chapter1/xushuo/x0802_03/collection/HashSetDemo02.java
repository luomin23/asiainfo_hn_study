package com.asiainfo.chapter1.xushuo.x0802_03.collection;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by root on 2017/8/3.
 * 重写equals()和HashCode()方法的HashSet集合
 * 集合中不会出现重复的元素
 */
class People {
    private String name;                                //定义name属性
    private int age;                                    //定义age属性
    public People(){                                  //无参构造方法
    }
    public People(String name, int age) {             //有参构造方法，初始化成员属性
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object o){                    //重写equals()方法
        if (this == o) {                                //判断当前对象与指定对象是否相同
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof People)) {
            return false;
        }
        People per =(People) o;
        if (this.name.equals(per.name)&&this.age == per.age) {
            return true;
        }else{
            return false;
        }
    }
    public int hashCode() {
        final int prime =13;
        int result =13;
        result =prime*result+((name==null)?0:name.hashCode());
        result =prime*result+age;
        return result;
    }
    public String toString() {
        return ("姓名: "+name+",年龄: "+age+"\n");
    }
}
public class HashSetDemo02 {
    public static void main(String[] args) {
        Set<People> set = new HashSet<People>();
        set.add(new People("小a",21));
        set.add(new People("小b",190));
        set.add(new People("张c",310));
        set.add(new People("李4",300));
        set.add(new People("小a",21));
        set.add(new People("小a",200));
        System.out.println(set);
    }
}
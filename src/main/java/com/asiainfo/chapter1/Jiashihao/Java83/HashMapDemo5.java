package com.asiainfo.chapter1.Jiashihao.Java83;

/**
 * Created by lenovo on 2017/8/3.
 */
import java.util.HashMap;
import java.util.Map;

class People2{
    private String name;
    private int age;
    public People2(String name,int age){
       this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj){
        if(this ==obj){
            return true;
        }
        if(!(obj instanceof People2)){
            return false;
        }
        People2 p = (People2)obj;
        if(this.name.equals(p.name)&&this.age == p.age){
            return true;
        }else{
            return false;
        }
    }
    public int hashCode(){
        return this.name.hashCode()*this.age;
    }
    public String toString(){
        return "姓名："+this.name+"年龄："+this.age;
    }
}
public class HashMapDemo5 {
    public static void main(String args[]){
        Map<People2,String> map = null;
        map = new HashMap<People2,String>();
        People2 per = new People2("JSH",23);
        map.put(per,"jsh");
        System.out.println(map.get(per));
    }
}

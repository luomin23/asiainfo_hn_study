package com.asiainfo.chapter1.xushuo.x0802_03.Fanxsl;

/**
 * Created by root on 2017/8/2.
 * 定义泛型类时生命多个类型
 */
class Generics<D ,S>{
    private D obj1;
    private S obj2;
    public Generics(){
    }
    public Generics(D obj1,S obj2){
        setObj1(obj1);
        setObj2(obj2);
    }

    public D getObj1() {
        return obj1;
    }

    public void setObj1(D obj1) {
        this.obj1 = obj1;
    }

    public S getObj2() {
        return obj2;
    }

    public void setObj2(S obj2) {
        this.obj2 = obj2;
    }
    public void show() {
        System.out.println("姓名："+getObj1()+",年龄："+getObj2());
    }
}
public class GenericsDemo03 {
    public static void main(String[] args) {
        Generics<String,Integer> gd = new Generics<String,Integer>("小强",21);
    }
}

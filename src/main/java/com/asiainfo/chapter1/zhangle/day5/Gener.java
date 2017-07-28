package com.asiainfo.chapter1.zhangle.day5;

import java.util.ArrayList;

/**
 * Created by del on 2017/7/28.
 * 泛型类
 */
public class Gener<G> {
    private G g;
    /*
    * 定义get set方法
    * */
    public G getG() {
        return g;
    }

    public void setG(G g) {
        this.g = g;
    }
    /*类型通配符   一般是使用?代替具体的类型参数。*/
    public static void getDate(Gener<?> data){
        System.out.println("get:"+data.getG());
    }

    public static void main(String[] args) {
        Gener<Integer> integer=new Gener<Integer>();
        Gener<String> string=new Gener<String>();
        /*使用set方法设置参数*/
        integer.setG(2);
        string.setG("er");
        /*使用get方法等到设置的值*/
        System.out.println(integer.getG());
        System.out.println(string.getG());
        /*使用自定义的getDate方法获得设置的值 等同于getG()方法*/
        getDate(integer);
        getDate(string);

    }
}

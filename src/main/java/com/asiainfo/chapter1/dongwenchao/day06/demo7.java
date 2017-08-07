package com.asiainfo.chapter1.dongwenchao.day06;
/**
 * Created by 超超 on 2017/7/31 0031.
 */
public class demo7<T> {
    private T t;
    public void add(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    public static void main(String[] args){
        demo7<Integer> a=new demo7<Integer>();
        demo7<String> b = new demo7<String>();
        a.add(new Integer(10));
        b.add(new String("董稳超"));
        System.out.printf("整型值为 :%d\n\n", a.get());
        System.out.printf("字符串为 :%s\n", b.get());
    }
}

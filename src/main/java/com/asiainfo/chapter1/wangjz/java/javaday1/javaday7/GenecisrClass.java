package com.asiainfo.chapter1.wangjz.java.javaday1.javaday7;

/**
 * Created by wjz123456 on 2017/8/2.
 */
public class GenecisrClass<E> {
    private E t;
    public  void add(E t){
        this.t=t;
    }
    public E get(){
        return t;
    }

    public static void main(String[] args) {
        GenecisrClass<Integer> i=new GenecisrClass<Integer>();
        GenecisrClass<String> s=new GenecisrClass<String>();
        i.add(20);
        s.add("wjz");
        System.out.println(s.get()+" "+i.get());
    }

}

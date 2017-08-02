package com.asiainfo.chapter1.Jiashihao;

/**
 * Created by lenovo on 2017/8/1.
 */
class info<T>{
    private T var;
    public T getVar(){
        return var;
    }
    public void setVar(T var){
        this.var = var;
    }
    public String toString(){
        return this.var.toString();
    }
};
public class GenericsDemo {
    public static void main(String[] args){
        info<Object> i1 = new info<Object>();
        info<String> i2 = new info<String>();
        i1.setVar(new Object());
        i1.setVar("JSH");
        fun(i1);
        fun(i2);
    }
    public static void fun(info<? super String> temp){
        System.out.println("内容："+temp);
    }
}

package com.asiainfo.chapter1.liangzhiqiang.day8;


/**
 * Created by 君不悔 on 2017/8/2.
 */
public class GenericTest {
    public static void main(String[]args){
        Box<String>name=new Box<String>("corn");
        System.out.println("name:"+name.getData());
    }

}
class Box<T>{
    private T data;
    public Box(){

    }
    public Box(T data){
        this.data=data;
    }
    public T getData(){
        return data;
    }
}

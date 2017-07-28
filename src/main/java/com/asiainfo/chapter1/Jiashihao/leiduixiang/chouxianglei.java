package com.asiainfo.chapter1.Jiashihao.leiduixiang;

/**
 * Created by lenovo on 2017/7/26.
 */
interface E{     //定义接口E
    public abstract void print();      //定义抽象方法print（）
};
class R implements E{               //子类实现接口
    public void print(){
        System.out.println("抽象类!");
    }
};
public class chouxianglei {

    public static void main(String args[]){
        E e= new R();                 //通过子类为接口实例化
        e.print();                  //调用的方法是被子类覆盖写过的方法
    }
}

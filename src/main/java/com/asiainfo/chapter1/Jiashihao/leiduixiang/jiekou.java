package com.asiainfo.chapter1.Jiashihao.leiduixiang;

/**
 * Created by lenovo on 2017/7/26.
 */
interface Q{     //定义接口Q
    public abstract void print();      //定义抽象方法print（）
};
class W implements Q{               //子类实现接口
    public void print(){
        System.out.println("接 口!");
    }
};
public class jiekou {

    public static void main(String args[]){
        Q q = new W();                 //通过子类为接口实例化
        q.print();                  //调用的方法是被子类覆盖写过的方法
    }
}

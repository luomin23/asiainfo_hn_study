package com.asiainfo.chapter1.Jiashihao.leiduixiang;

/**
 * Created by lenovo on 2017/7/27.
 */
class M{
    public void fun1(){                               //定义fun1（）方法
        System.out.println("M--1");
    }
    public void fun2(){                                  //定义fun2（）方法
        this.fun1();
    }
};
class N extends M{                                     //子类通过extends继承父类
    public void fun1() {                               //覆盖父类中的fun1（）方法
        System.out.println("N--1");
    }
 public void fun3(){                                  //子类自己定义的方法
     System.out.println("N--3");
    }
};
class V extends M{                                  //类通过extends继承父类
    public void fun1(){                             //覆盖父类中的fun1（）方法
        System.out.println("V--1");
    }
    public void fun5(){                             //子类自己定义的方法
        System.out.println("V--3");
    }
};
public class duotai2 {
    public static void main(String args[]){
        fun(new N());                               //传递N类实例，产生向上转型
        fun(new V());                               //传递V类实例，产生向上转型
    }
    public static void fun(M m) {                 //此方法可以分别调用各自子类单独定义的方法
        m.fun1();
        if (m instanceof N) {                       //判断是否是N实例
            N n = (N) m;                               //进行向下转型
            n.fun3();                                  //调用子类自己定义的方法
        }
        if (m instanceof V) {                         //判断是否是V实例
            V v = (V) m;                               //进行向下转型
            v.fun5();                                   //调用子类自己定义的方法
        }
    }
}

package com.asiainfo.chapter1.Jiashihao.leiduixiang;

/**
 * Created by lenovo on 2017/7/26.
 */
class A{
    public void fun1(){                  //定义fun1（）方法
        System.out.println("A-->public void fun1(){}");
    }
    public void fun2(){                   //定义fun2（）方法
        this.fun1();
    }
};
class B extends A{                        //子类通过extends继承父类
    public void fun1(){                    //覆盖父类中的fun1（）方法
        System.out.println("B-->public void fun1(){}");
    }
    public void fun3(){                     //子类自己定义的方法
        System.out.println("B-->public void fun3(){}");
    }
};
class C extends A{                                  //子类通过extends继承父类
    public void fun1(){                             //覆盖父类中的fun1（）方法
        System.out.println("C-->public void fun1(){}");
    }
    public void fun5(){                              //子类自己定义的方法
        System.out.println("C-->public void fun3(){}");
    }
};
public class duotai {
    public static void main(String agrs[]){
        fun(new B());                                  //传递B类实例，产生向上转型
        fun(new C());                                  //传递C类实例，产生向上转型
    }
    public static void fun(A a){                      //接收父类对象
        a.fun1();
    }
}

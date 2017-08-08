package com.asiainfo.chapter1.fengzx.Aug01;

/**
 * Created by fengzx on 2017/8/1.
 */

interface Inter{
    public abstract void show();
    public abstract void show2();
}

class Outer{
    public void method(){
        //一个方法的调用
//        new Inter(){
//            public void show(){
//                System.out.println("show");
//            }
//        }.show();

        //多个方法的调用
        /*
        new Inter(){
            public void show(){
                System.out.println("show");
            }

            public void show2(){
                System.out.println("show2");
            }
        }.show();

        new Inter(){
            public void show(){
                System.out.println("show");
            }

            public void show2(){
                System.out.println("show2");
            }
        }.show2();
        */

        ///整体是Inter的实现类的匿名对象
        Inter i = new Inter(){
            public void show(){
                System.out.println("show");
            }

            public void show2(){
                System.out.println("show2");
            }
        };
        i.show();
        i.show2();
    }
}

public class OuterDemo {
    public static void main(String[] args){
        Outer o = new Outer();
        o.method();
    }
}

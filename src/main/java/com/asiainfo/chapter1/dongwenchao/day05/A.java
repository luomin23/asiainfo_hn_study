package com.asiainfo.chapter1.dongwenchao.day05;

/**
 * Created by 超超 on 2017/7/28 0028.
 */
public class A {
    public String show(D obj) {
        return ("A and D");
    }
    public String show(A obj) {
        return ("A and A");
    }
}
 class B extends A{
    public String show(B obj){
        return ("B and B");
    }
    public String show(A obj){
        return ("B and A");
    }
}
 class C extends B{
}
 class D extends B{
}
 class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1--" + a1.show(b));//a1证明在A()中找。传一个B类型的b的参数所以输出B and B 不能输出B and B因为B类是子类
        // 不能输出A and D是因为要找直接父类

        System.out.println("2--" + a1.show(c));//输出 A and A。

        System.out.println("3--" + a1.show(d));//输出 A and D

        System.out.println("4--" + a2.show(b));  //4--B and A .首先a2是A引用，B实例，调用show（B b）方法，此方法在父类A中没有定义，所以B中方法show(B b)不会调用（多态必须父类中已定义该方法），再按优先级为：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)，即先查this对象的父类，没有重头再查参数的父类。查找super.show((super)O)时，B中没有，再向上，找到A中show(A a),因此执行。

        System.out.println("5--" + a2.show(c));  //同上

        System.out.println("6--" + a2.show(d));  //A and D .查找B中没有show(D d)方法，再查A中，有，执行。

        System.out.println("7--" + b.show(b));

        System.out.println("8--" + b.show(c));  //B and B .
        System.out.println("9--" + b.show(d));
    }
}
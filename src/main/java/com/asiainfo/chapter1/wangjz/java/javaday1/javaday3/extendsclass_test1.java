package com.asiainfo.chapter1.wangjz.java.javaday1.javaday3;

/**
 * Created by wjz123456 on 2017/7/26.
 */
public class extendsclass_test1 extends class_test1 {

    public extendsclass_test1(String s) {
        super(s);
    }
    @Override
    public  void eat(String s) {
        super.eat("苹果");
        System.out.println("我也喜欢吃" + s);

    }
    public static void main(String[] args) {
        extendsclass_test1 s=new extendsclass_test1("w王景州");

        s.setAge(21);
        s.getAge();
        s.eat("芒果");
    }
}

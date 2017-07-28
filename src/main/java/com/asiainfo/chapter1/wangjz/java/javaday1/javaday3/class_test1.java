package com.asiainfo.chapter1.wangjz.java.javaday1.javaday3;

/**
 * Created by wjz123456 on 2017/7/26.
 */
public class class_test1 {
    public int Aage;
    public String name;
    public class_test1(String w){
        this.name=w;
    System.out.println("我的名字是  "+name);
}
    public void eat(String s){
        System.out.println("我喜欢吃"+s);
    }
    public void setAge(int age){
    Aage=age;
}
    public int getAge() {
        System.out.println("我的年龄是  "+Aage);
        return Aage;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
class_test1 s=new class_test1("王景州");
        s.setAge(21);
        s.getAge();
        System.out.println(s.Aage);

    }

}

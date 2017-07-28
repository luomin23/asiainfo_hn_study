package com.asiainfo.chapter1.zhangle.day5;

/**
 * Created by del on 2017/7/28.
 */
public class Inner {
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /*
    *常规内部类
    * 可直接调用外部类实例变量、方法
     *  */
    class In{
        public void test(){
            id=2;
            System.out.print("在内部类输出");
            innerWork();
            System.out.println("内部类输出id="+id);

        }
    }

    /**
     * 外部类方法
     */
    public void innerWork(){
        In in=new In();
        System.out.print("外部类的id="+id+"\n");
    }
    public static void main(String[] args) {
        Inner inner=new Inner();
        inner.innerWork();
        Inner.In in=inner.new In();
        in.test();

    }

}

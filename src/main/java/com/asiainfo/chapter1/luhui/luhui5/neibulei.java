package com.asiainfo.chapter1.luhui.luhui5;

/**
 * Created by 18237161432 on 2017/7/28.
 */
public class neibulei {
    private int a;
    private int count;
    public class Student{
        String name;

        public   Student(String n1){
            this.name=n1;
            count++;
        }
        public void output(){
            System.out.println(this.name);
        }}
        public void output(){
            Student s=new Student("Johnson");
            s.output();
            System.out.println("count="+this.count+this.a);
        }


    public static void main(String [] args){
         neibulei n=new neibulei();
        n.output();
    }
}

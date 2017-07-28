package com.asiainfo.chapter1.fengzx.July26;

/**
 * Created by fengzx on 2017/7/26.
 */
class Test1 {
    public static void main(String[] args){
        Demo1 d = new Demo1();

        //public void printSum(int a,int b)
        d.printSum(1,2);

        //public int getSum(int a,int b)
        int sum = d.getSum(10,20);
        System.out.println(sum);

        //public void printStudent(Student1 s)
        Student1 s = new Student1();
        d.printStudent(s);

        //public Student1 getStudent()
        Student1 ss = d.getStudent();
        ss.show();
    }
}

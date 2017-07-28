package com.asiainfo.chapter1.fengzx.July26;

/**
 * Created by fengzx on 2017/7/26.
 */
class Demo1 {
    //基本类型作为形式参数
    public void printSum(int a,int b){
        int sum = a + b;
        System.out.println(sum);
    }

    //基本类型作为返回值
    public int getSum(int a,int b){
        return a + b;
    }

    //引用参数作为形式参数
    public void printStudent(Student1 s){
        s.show();
    }

    //引用类型作为返回值
    public Student1 getStudent(){
        Student1 s = new Student1();
        return s;
    }

}

package com.asiainfo.chapter1.fengzx.July31;

/**
 * Created by fengzx on 2017/7/31.
 */

 class Teacher{
    private String name;
    private int age;

    public Teacher(){
        super();
    }

    public Teacher(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    /*
    public boolean compare(Teacher t1,Teacher t2){

//        t1.getName() == t2.getName();

//        if (t1.getName().equals(t2.getName()) && t1.getAge() == t2.getAge()){
//            return true;
//        }else{
//            return false;
//        }

        if (t1.name.equals(t2.name) && t1.age == t2.age){
            return true;
        }else {
            return false;
        }

    }
*/

//    public boolean compare(Teacher t){
//        if (this.name.equals(t.name) && this.age == t.age){
//            return true;
//        }else {
//            return false;
//        }
//    }

//    public boolean equals(Object obj){
//        Teacher t = (Teacher)obj;
//        if (this.name.equals(t.name) && this.age == t.age){
//            return true;
//        }else {
//            return false;
//        }
//    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj instanceof Teacher){
            Teacher t = (Teacher)obj;
            return this.name.equals(t.name) && this.age == t.age;
        }
        return false;
    }

    public String toString(){
        return "name:"+name+", age:"+age;
    }
}

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("fengzx");
        t.setAge(27);
        System.out.println(t);

        Teacher t1 = new Teacher("fzx",20);
        Teacher t2 = new Teacher("fzx",20);
        System.out.println(t1 == t2);   //false

//        System.out.println(t1.compare(t1, t2));  //true

//        System.out.println(t1.compare(t2));  //true

        System.out.println(t1.equals(t2));   //false --> true
        System.out.println(t1.equals(t1));

        Demot d = new Demot();
        System.out.println(t1.equals(d));
    }
}

class Demot {}
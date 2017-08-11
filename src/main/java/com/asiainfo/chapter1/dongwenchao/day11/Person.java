package com.asiainfo.chapter1.dongwenchao.day11;

/**
 * Created by 超超 on 2017/8/6 0006.
 */
 class Person {
    private int age;
    private String name;
    public Person(){
    }
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class SuperMan extends Person implements ActionInterface
{
    private boolean BlueBriefs;
    public void fly()
    {
        System.out.println("超人会飞耶～～");
    }
    public boolean isBlueBriefs() {
        return BlueBriefs;
    }
    public void setBlueBriefs(boolean blueBriefs) {
        BlueBriefs = blueBriefs;
    }
    @Override
    public void walk(int m) {
        System.out.println("超人会走耶～～走了" + m + "米就走不动了！");
    }
}
interface ActionInterface{
    public void walk(int m);
}

package com.asiainfo.chapter1.fengzx.Aug01;

/**
 * Created by fengzx on 2017/8/1.
 */

interface SpeakingEnglish{
    public abstract void speak();
}

abstract class Person{
    private String name;
    private int age;

    public Person(){}

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name ){
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

    public abstract void eat();

}

abstract class Player extends Person{
    public Player(){}

    public Player(String name,int age){
        super(name, age);
    }

    public abstract void study();
}

abstract class Coach extends Person{
    public Coach(){}

    public Coach(String name,int age){
        super(name, age);
    }

    public abstract void teach();
}

class PingPangPlayer extends Player implements SpeakingEnglish{
    public PingPangPlayer(){}

    public PingPangPlayer(String name,int age){
        super(name, age);
    }

    public void speak(){
        System.out.println("乒乓球运动员说英语");
    }

    public void eat(){
        System.out.println("乒乓球运动员吃鸡蛋");
    }

    public void study(){
        System.out.println("乒乓球运动员学乒乓");
    }
}

class BasketBallPlayer extends Player{
    public BasketBallPlayer(){}

    public BasketBallPlayer(String name,int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("篮球运动员吃牛肉");
    }

    public void study(){
        System.out.println("篮球运动员学篮球");
    }
}

class PingPangCoach extends Coach implements SpeakingEnglish{
    public PingPangCoach(){}

    public PingPangCoach(String name,int age){
        super(name, age);
    }

    public void speak(){
        System.out.println("乒乓球教练说英语");
    }

    public void eat(){
        System.out.println("乒乓球教练吃鸡蛋黄");
    }

    public void teach(){
        System.out.println("乒乓球教练教乒乓");
    }
}

class BasketBallCoach extends Coach{
    public BasketBallCoach(){}

    public BasketBallCoach(String name,int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("篮球教练吃牛肉汤");
    }

    public void teach(){
        System.out.println("篮球教练教篮球");
    }
}

public class PersonDemo {
    public static void main(String[] args){
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("张继科");
        ppp.setAge(30);
        System.out.println(ppp.getName()+"---"+ppp.getAge());
        ppp.speak();
        ppp.study();
        ppp.eat();

        System.out.println("---------------------------");

        BasketBallPlayer bbp = new BasketBallPlayer();
        bbp.setName("姚明");
        bbp.setAge(35);
        System.out.println(bbp.getName()+"---"+bbp.getAge());
        bbp.study();
        bbp.eat();

        System.out.println("---------------------------");

        PingPangCoach ppc = new PingPangCoach();
        ppc.setName("刘国梁");
        ppc.setAge(50);
        System.out.println(ppc.getName()+"---"+ppc.getAge());
        ppc.speak();
        ppc.teach();
        ppc.eat();

        System.out.println("---------------------------");

        BasketBallCoach bbc = new BasketBallCoach();
        bbc.setName("篮教");
        bbc.setAge(55);
        System.out.println(bbc.getName()+"---"+bbc.getAge());
        bbc.teach();
        bbc.eat();
    }
}

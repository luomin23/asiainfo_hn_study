package com.asiainfo.chapter1.zhangle.day4;

import java.util.Scanner;

/**
 * Created by del on 2017/7/27.
 */
public class Games {
    static Scanner sc=new Scanner(System.in);
    Person p;
    //static Vehicle vehicle=new Gun();
    static Pattern pn=new Patterns();


    public Games(){}
    public Games(Person p){
        this.p=p;
    }
    public void login(){
        p.login();

    }
    public void add(String name,int passsword){
        p.createUser(name,passsword);
    }

    public static void main(String[] args) {

        Person p=new PersonUser();
        Games g=new Games(p);
        System.out.println("欢迎进入游戏：");
        System.out.println("请选择登录（输入1）/注册（输入2）退出（输入0）：");
        int in=sc.nextInt();
        if(in==1){
            g.login();
            System.out.println("选择模式：入门（输入1）/一般（输入2）/复杂（输入3）");
            pn.select();

        }else if(in==0) {
            System.out.println("你确定要退出吗？是（输入1）/否（输入2）");
            int an = sc.nextInt();
            if (an == 2) {
                System.out.println("选择模式：入门（输入1）/一般（输入2）/复杂（输入3）");
                pn.select();
            } else {

                System.out.println("退出游戏");
                //System.exit(1);
            }
        }else if(in==2){
            String name=sc.next();
            int pwd=sc.nextInt();
            g.add(name,pwd);
        }
    }
}

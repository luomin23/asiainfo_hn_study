package com.asiainfo.chapter1.zhangle.day4;

import java.util.Scanner;

/**
 * Created by del on 2017/7/26.
 */
abstract class Person {
    public abstract void createUser(String name,int password);
    public abstract void login();

}
class PersonUser extends Person {

    public void createUser(String name, int password) {}

    public void login() {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.print("账号：");
            String name=sc.next();
            System.out.print("密码：");
            int password=sc.nextInt();
            if(name != "zl" && password != 1234) {
                System.out.println("账号或密码错误！");
                continue;

            }else{
                break;
            }
        }
    }
}


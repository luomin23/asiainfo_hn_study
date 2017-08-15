package com.asiainfo.chapter1.liuwy.August08;

import com.asiainfo.chapter1.liuwy.zuoye.Person;

import java.util.Scanner;

/**
 * Created by LENOVO on 2017/8/9.
 */
public class PersonView {
    private static Scanner scanner=new Scanner(System.in);
    public static void save() {
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入电话：");
        int phonenumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入地址：");
        String address = scanner.nextLine();
        System.out.println("请输入emil：");
        String emil = scanner.nextLine();
        System.out.println("请输入生日（年）：");
        int birth = scanner.nextInt();
        scanner.nextLine();

        //Person person=new Person(name,phonenumber,address,emil,birth);
        Person person = new Person();
        person.setName(name);
        person.setPhonenumber(phonenumber);
        person.setAddress(address);
        person.setEmil(emil);
        person.setBirth(birth);


        PersonBIZ personBIZ = new PersonBIZ();
        if (personBIZ.save(person)) {
            System.out.println("保存成功！");
        } else {
            System.out.println("保存失败！");
        }

    }

    public static void find() {
        System.out.println("输入手机号：");
        int phonenumber = scanner.nextInt();
        scanner.nextLine();

        PersonBIZ personBIZ = new PersonBIZ();
        Person person = personBIZ.findByPhone(phonenumber);
        if (person == null) {
            System.out.println("有问题");
        } else {
            System.out.println(person.getId());
            System.out.println(person.getName());

        }
    }
    public static void main(String[] args){
        find();

    }
}

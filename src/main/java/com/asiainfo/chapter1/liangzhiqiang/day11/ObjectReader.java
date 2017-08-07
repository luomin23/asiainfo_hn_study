package com.asiainfo.chapter1.liangzhiqiang.day11;

/**
 * Created by 君不悔 on 2017/8/7.
 */
import java.io.*;
public class ObjectReader {
    public static void main(String[]args)throws Exception{
        //创建文件输入流对象，用于读取指定文件的数据
        FileInputStream fis=new FileInputStream("objectStream.txt");
        //创建对象输入流，并且从指定的输入流中读取数据
        ObjectInputStream ois=new ObjectInputStream(fis);
        //从objectStream.txt中读取Person对象
        Person p=(Person)ois.readObject();
        System.out.println("------------从文件中读取后----------");
        System.out.println("Person对象的id："+p.getId());
        System.out.println("Person对象的name："+p.getName());
        System.out.println("Person对象的age："+p.getAge());
    }

}
class Person implements Serializable{
    private String id;
    private String name;
    private String age;
    public Person(String id,String name,String age){
        super();
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return  name;
    }
    public String getAge(){
        return age;
    }
}

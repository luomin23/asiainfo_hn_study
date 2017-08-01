package com.asiainfo.chapter1.zhangle.javaapi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by del on 2017/7/31.
 * DeserializeDemo 程序实例了反序列化
 */
public class Deserialize {
    public static void main(String[] args) {
        Employee ee=null;
        try {
            FileInputStream fi=new FileInputStream("employee.ser");
            ObjectInputStream os=new ObjectInputStream(fi);
            ee=(Employee) os.readObject(); //添加异常
            os.close();
            fi.close();


        }catch (IOException e){
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException e) {
            System.out.println("Employee fiel is not found");
            e.printStackTrace();
            return;
        }
        System.out.println("Deresialized Employee");
        System.out.println("name:"+ee.name);
        System.out.println("name:"+ee.password);

    }



}

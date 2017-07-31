package com.asiainfo.chapter1.zhangle.javaapi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by del on 2017/7/31.
 * SerializeDemo 例子实例化了一个 Employee 对象，并将该对象序列化到一个文件中。
 */
public class SerializeDemo {
    public static void main(String[] args) {
        Employee ee=new Employee();
        ee.name="hao";
        ee.password=1234;
        try {
            FileOutputStream fs=new FileOutputStream("employee.ser");
            ObjectOutputStream os=new ObjectOutputStream(fs);
            os.writeObject(ee);
            os.close();
            fs.close();
            System.out.printf("Serialized date saved employee.ser");

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}


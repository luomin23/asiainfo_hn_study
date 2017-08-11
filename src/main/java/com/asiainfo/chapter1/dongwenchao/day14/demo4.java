package com.asiainfo.chapter1.dongwenchao.day14;

import com.alibaba.fastjson.util.IOUtils;
import com.asiainfo.chapter1.dongwenchao.zuoye1.demo1;
import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;

import java.io.*;

import static com.alibaba.fastjson.util.IOUtils.UTF8;

/**
 * Created by 超超 on 2017/8/8 0008.
 */
public class demo4 {
        public static void main(String[] args)
        {
            demo1 st = new demo1("1","董稳超","男","15093279878");
            File file = new File("D:\\Java\\Git\\test\\asiainfo_hn_study\\asd.txt");
            try
            {
                file.createNewFile();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            try
            {
                //Student对象序列化过程
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream  writer=new ObjectOutputStream(fos);
                writer.writeObject(st);
                writer.flush();
                writer.close();
                writer.close();
                //Student对象反序列化过程
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                demo1 st1 = (demo1) ois.readObject();
                System.out.println("编号 = " + st1.getId());
                System.out.println("姓名 = " + st1.getName());
                System.out.println("性别 = " + st1.getSex());
                System.out.println("电话 = " + st1.getTel());
                ois.close();
                fis.close();
            }
            catch(ClassNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
}

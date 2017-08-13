package com.asiainfo.chapter1.liuwy.zuoye;

import java.io.File;
import java.io.Serializable;
import java.util.List;

import com.asiainfo.chapter1.liuwy.August08.PersonBIZ;
import com.asiainfo.chapter1.liuwy.zuoye.Person;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class Demo implements Serializable {


    public void reader() {
        SAXReader reader = new SAXReader();
        File file = new File("D:\\Git\\gitworkspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\liuwy\\zuoye\\me.xml");
        Document document = null;
        try {
            document = reader.read(file);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Element root = document.getRootElement();
        List<Element> childElements = root.elements();
        for (Element child : childElements) {

            //已知子元素名的情况下

            String id=child.elementText("id");
            String name=child.elementText("name");
            String phonenumber=child.elementText("phonenumber");
            String address=child.elementText("address");
            String emil=child.elementText("emil");
            String birth=child.elementText("birth");



            System.out.println("id:" + id);
            System.out.println("name:" + name);
            System.out.println("phonenumber:" + phonenumber);
            System.out.println("address:" + address);
            System.out.println("emil:" + emil);
            System.out.println("birth:" + birth);

            Person one=new Person();

            one.setName(name);
            int num=Integer.parseInt(phonenumber);
            one.setPhonenumber(num);
            one.setAddress(address);
            one.setEmil(emil);
            int bir=Integer.parseInt(birth);
            one.setBirth(bir);

//            try {
//                Class c=Class.forName("com.asiainfo.chapter1.liuwy.August08.PersonBIZ");
//                Constructor con=c.getConstructor();
//                Object obj=con.newInstance();
//
//                Method m=c.getMethod("save");
//                m.invoke(obj);
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            } catch (NoSuchMethodException e) {
//                e.printStackTrace();
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }

            PersonBIZ personBIZ = new PersonBIZ();
            if (personBIZ.save(one)) {
                System.out.println("保存成功！");
            } else {
                System.out.println("保存失败！");
            }
            //这行是为了格式化美观而存在
            //未知属性名情况下
   /*List<Attribute> attributeList = child.attributes();
   for (Attribute attr : attributeList) {
    System.out.println(attr.getName() + ": " + attr.getValue());
   }*/

            //已知属性名情况下
            //System.out.println("id: " + child.attributeValue("id"));

            //未知子元素名情况下
   /*List<Element> elementList = child.elements();
   for (Element ele : elementList) {
    System.out.println(ele.getName() + ": " + ele.getText());
   }
   System.out.println();*/
            System.out.println();
        }
    }

}
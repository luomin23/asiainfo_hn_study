package com.asiainfo.chapter1.liuwy.zuoye;

/**
 * Created by LENOVO on 2017/8/13.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


public class Write {
    public static void write(int id,String name,int phone,String address,String email,int birth)throws Exception{

        SAXReader reader = new SAXReader();

            // 2.通过reader对象的read方法加载xml文件，获取Document对象
            org.dom4j.Document document = reader.read(new File(
                    "D:\\Git\\gitworkspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\liuwy\\zuoye\\me.xml"));
            org.dom4j.Element person = document.getRootElement();// 通过document对象获取根节点bookstore

            org.dom4j.Element personal = person.addElement("personal");
            org.dom4j.Element id2 = personal.addElement("id");
            id2.setText(id+"");
        org.dom4j.Element name2 = personal.addElement("name");
        name2.setText(name);
        org.dom4j.Element phone2 = personal.addElement("phonenumber");
        phone2.setText(phone+"");
        org.dom4j.Element address2 = personal.addElement("address");
        address2.setText(address);
        org.dom4j.Element email2 = personal.addElement("emil");
        email2.setText(email+"");
        org.dom4j.Element birth2 = personal.addElement("birth");
        birth2.setText(birth+"");


            // 3.设置输出格式和输出流
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter writer = new XMLWriter(new FileOutputStream(
                    "D:\\Git\\gitworkspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\liuwy\\zuoye\\me.xml"), format);
            writer.write(document);// 将文档写入到输出流
            writer.close();

}
}
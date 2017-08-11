package com.asiainfo.chapter1.zhangle.MailWorks;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by del on 2017/8/9.
 */
public class MailArray {
   public static JSONArray arrays(){
        /*（1）直接转换：
            创建JSONArray对象、JSONObject对象，
            通过put方法将其数据以键值对的形式填充
        */
        ArrayList<Mail> mails=new ArrayList<Mail>();
       /* for(int i=0;i<10;i++){
            mails.add(new Mail(1004,"zl","12345678910","文化路","12121212",19950816));
        }*/
        JSONArray array=new JSONArray();  // Json格式的数组形式
        JSONObject object=new JSONObject();
       System.out.println("数组");

       for(int i=0;i<mails.size();i++){
            ////依次填充每一个Java实体对象
            object.put("id",mails.get(i).getId());
            object.put("name",mails.get(i).getName());
            object.put("telephone",mails.get(i).getTelephone());
            object.put("address",mails.get(i).getAddress());
            object.put("email",mails.get(i).getEmail());
            object.put("born",mails.get(i).getBorn());
            array.add(object); //将JSONObject添加入JSONArray
            //System.out.println(array.toString());

        }
       return array;

    }

    public static String stringFile(String file){
        File f=new File(file);
        InputStream is=null;
        BufferedReader br=null;
        String s="";

        try {
            is=new FileInputStream(f);
            InputStreamReader isr=new InputStreamReader(is);
            br=new BufferedReader(isr);
            while ((s=br.readLine())!=null){
                System.out.println(s);
            }
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("关闭");
            }
            try {
                is.close();
            } catch (IOException e) {
                System.out.println("关闭异常");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("读取数据异常");
        }
    return s;
    }

    public static void main(String[] args) {
        String file="D:\\Git\\Git\\asiainfo_hn_study\\Mail.json";
        stringFile(file);
        arrays();



    }
}

package com.asiainfo.chapter1.xushuo.ScoketDemo03;

import com.asiainfo.chapter1.xushuo.ScoketDemo03.InfoBean;
import com.asiainfo.chapter1.xushuo.ScoketDemo03.OperationDB02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//读取文件
public class ReadFile02 {
    public static void readTxtFile(String filePath) {
        InfoBean infoBean=new InfoBean();
        try {
            String encoding = "UTF-8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                OperationDB02 operationDB=new OperationDB02();
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    String[] s=lineTxt.split(",");
                    infoBean.setNumberz(s[1].toString());
                    infoBean.setNamez(s[1].toString());
                    infoBean.setSite(s[2].toString());
                    infoBean.setEmil(s[3].toString());
                    infoBean.setBitrthday(s[4].toString());


                    operationDB.addRcorder(infoBean);
                    System.out.println(lineTxt);

                }
                read.close();
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
    }
}
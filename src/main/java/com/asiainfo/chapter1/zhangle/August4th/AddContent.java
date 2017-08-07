package com.asiainfo.chapter1.zhangle.August4th;

import java.io.*;

/**
 * Created by del on 2017/8/4.
 */
public class AddContent {


    /*
    向原有文件追加内容
    使用BufferedWriter
    */
    public static void addContent(File f) throws FileNotFoundException {
       /* //方法失败了
       Writer w = null;
        try {
            w = new FileWriter(f);
            //w.append("so");
            w.append("1soso",2,4);
            w.close();
            System.out.println("追加成功");
        } catch (IOException e) {
            System.out.println("");
        }*/
        BufferedWriter bw=null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true)));
            bw.write("first");
            System.out.println("添加成功");
        }catch (FileNotFoundException e){
            System.out.println("文件未找到");
        } catch (IOException e) {
            System.out.println("添加异常");
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                System.out.println("关闭时异常");
            }

        }

    }

    public static void main(String[] args) throws Exception {
        File f=new File("D:\\Git\\Git\\asiainfo_hn_study\\input.txt");
        addContent(f);
    }

}

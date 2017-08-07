package com.asiainfo.chapter1.zhangle.August7th;

import java.io.*;

/**
 * Created by del on 2017/8/7.
 */
public class BookRead {

    /*读取json数据
    * 出现问题：Book.json的数据运行几次后，输出为空了
    * 出错在s=br.readLine() s值为空
    * */
    public static void reaeJSON(){
        BufferedReader br=null;
        try {
            // 读取原始json文件
            br=new BufferedReader(new FileReader("Book.json"));
            String s=null;
            while ((s=br.readLine())!=null){
                //输出json文件
                System.out.println(s);

            }

        } catch (FileNotFoundException e) {
            System.out.println("未找到json文件");
        } catch (IOException e) {
            System.out.println("json文件输出异常");
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("json文件关闭异常");
            }
        }
    }

    public static void main(String[] args) {
        reaeJSON();

    }
}

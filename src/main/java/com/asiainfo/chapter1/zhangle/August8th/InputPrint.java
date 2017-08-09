package com.asiainfo.chapter1.zhangle.August8th;

import java.io.*;

/**
 * Created by del on 2017/8/8.
 */
public class InputPrint {

    public static void main(String[] args) {
        File f=new File("D:\\Git\\Git\\asiainfo_hn_study\\input.txt");
        printFile(f);
    }

    private static void printFile(File f) {
        InputStream is=null;
        try {
            is=new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到");
        }
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        String s=null;
        try {
            if((s=br.readLine())!=null){
                System.out.println(s);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}

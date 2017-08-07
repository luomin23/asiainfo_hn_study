package com.asiainfo.chapter1.fengzx.Aug03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by fengzx on 2017/8/3.
 */
public class CopyDemo {
    public static void main(String[] args){
        FileReader fr = null;
        FileWriter fw = null;

        try {

            fr = new FileReader("G:\\a.txt");
            fw = new FileWriter("G:\\copy.txt");

//        int ch = 0;
//        while ((ch = fr.read()) != -1){
//            fw.write(ch);
//        }

            char[] chs = new char[1024];
            int len = 0;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }

        }catch (FileNotFoundException e){
            System.out.println("找不到文件");
        }catch (IOException e){
            System.out.println("读写文件失败");
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

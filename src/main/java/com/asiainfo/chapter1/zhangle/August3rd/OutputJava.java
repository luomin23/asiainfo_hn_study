package com.asiainfo.chapter1.zhangle.August3rd;

import java.io.*;

/**
 * Created by del on 2017/8/3.
 */
public class OutputJava {

    /*向文件内写入数据*/
    public static void output(File f) throws IOException {
        OutputStream os=null;
        try {
            os= new FileOutputStream(f);
            OutputStreamWriter or=new OutputStreamWriter(os,"UTF-8");
            //or.write("so");  //写入数据完整的
            /*
            * write(String str, int off, int len)
            * str是要写入的内容
            * off是偏移量 即str中写入的数据开始的下标
            * len是写入数据的总长度
            * 注意str的长度应 >= (off+len)-1
            * */
            or.write("so123456789",2,9);
            or.flush();
            or.close();

        }catch (FileNotFoundException e){
            System.out.println("未找到文件");
        } catch (IOException e) {
            System.out.println("抛出IO异常");
        }finally {
            os.close();
            System.out.println("已写入文件");
        }

    }

    /*向原有文件追加内容*/
    public static void addContent(File f) throws IOException {
        Writer w=null;
        try {
            w = new FileWriter(f);
            w.append("so");
            w.close();
            System.out.println("追加成功");
        }catch (IOException e){
            System.out.println("");
        }


    }

    public static void main(String[] args) throws Exception {
        File f=new File("D:\\Git\\Git\\asiainfo_hn_study\\input.txt");
        output(f);
        addContent(f);

    }
}

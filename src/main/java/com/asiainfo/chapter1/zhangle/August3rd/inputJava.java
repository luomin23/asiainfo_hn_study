package com.asiainfo.chapter1.zhangle.August3rd;

import java.io.*;

/**
 * Created by del on 2017/8/3.
 */
public class inputJava {

   /*FileInputStream从本地文件读取数据*/
    public static void inputRead(String s) throws Exception {
        File f=new File(s);
        InputStream input = null;
        try {
            input = new FileInputStream(f);
            if (f.isFile() && f.exists()) {
                InputStreamReader ir = new InputStreamReader(input, "utf-8");  //读取字节并将其解码为字符
                BufferedReader br = new BufferedReader(ir);  //将缓冲指定文件的输入
                String string = null;  // readLine()读取一个文本行
                while ((string = br.readLine()) != null) {
                    System.out.println(string);
                }
                br.close();  //关闭该流并释放与之关联的所有资源
            } else {
                System.out.println("文件不存在");
            }
        }catch (Exception e){
            System.out.println("抛出异常");
        }


    }
    public static void inputWork(String s) throws IOException {
        File f=new File(s);
        InputStream input = null;
        try {
            input = new FileInputStream(f);
            //input.read();//是int类型
           // byte[] b=new byte[5];  //如果因为已经到达流末尾而不再有数据可用，则返回 -1。

            int count = 0;
            while(input.read()!=-1){
                count++;
            }
            System.out.println("文件长度为："+count);
            /*输出文件内容
            * 判断是否是标准文件 和 是否目录正确
            * */

        }catch (FileNotFoundException e){
            System.out.println("未找到文件");
        }catch (IOException I){
                System.out.println("文件发生io异常");
        } finally{
                input.close();
        }

    }

    public static void main(String[] args) throws Exception {
        String s="D:\\Git\\Git\\asiainfo_hn_study\\input.txt";
        inputWork(s);
        inputRead(s);
        /*
        上面的两个方法放到一起时会出现错误
        先读取文件长度时会导致无法读取本地文件数据（inputRead(s)内的输出不显示）
        先读取文件数据时会抛出异常输出文件发生io异常
        */

    }
}

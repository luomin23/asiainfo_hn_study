package com.asiainfo.chapter1.Jiashihao.org.lxh.demo12.execdemo;

/**
 * Created by lenovo on 2017/8/8.
 */
import java.io.File;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
public class FileCD {
    public static void main(String[] args) throws Exception{
        File file =new File("d:"+File.separator+ "数据库.txt");
        FileInputStream input = null;
        input = new FileInputStream(file);
        FileChannel fin = null;
        fin = input.getChannel();
        MappedByteBuffer mbb = null;
        mbb = fin.map(FileChannel.MapMode.READ_ONLY,0,file.length());
        byte data[] = new byte[(int)file.length()];
        int foot = 0;
        while(mbb.hasRemaining()){
            data[foot++]=mbb.get();
        }
        System.out.println(new String(data));
        fin.close();
        input.close();
    }
}

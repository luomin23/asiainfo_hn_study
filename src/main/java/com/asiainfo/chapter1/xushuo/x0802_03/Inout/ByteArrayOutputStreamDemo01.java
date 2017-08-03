package com.asiainfo.chapter1.xushuo.x0802_03.Inout;

import java.io.ByteArrayOutputStream;

/**
 * Created by root on 2017/8/3.
 */
public class ByteArrayOutputStreamDemo01 {
    public static void main(String[] args) {
        byte[] b ={'A','B','C','D','E','f'};
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        bos.write(b,0,b.length);
        System.out.println("缓冲区的字节数: "+bos.size());
        byte bout[] = bos.toByteArray();
        for (int i =0;i<bout.length;i++)
        {
            System.out.print((char)bout[i]+"\t");
        }
        System.out.println();
    }
}

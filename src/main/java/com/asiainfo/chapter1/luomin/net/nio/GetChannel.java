package com.asiainfo.chapter1.luomin.net.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 产生可写的,可读可写的以及可读的通道
 *
 * @author Luoo
 * @create 2017-08-08 11:01
 */

public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luomin\\net\\nio\\data.txt");
        FileChannel fc = fos.getChannel();
        // 将字节数组包装到缓冲区中
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();

        // 随机读写文件流创建的管道
        fc = new RandomAccessFile("C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luomin\\net\\nio\\data.txt", "rw").getChannel();
        // fc.position()计算从文件的开始到当前位置之间的字节数
        System.out.println("此通道的文件位置：" + fc.position());
        // 设置此通道的文件位置,fc.size()此通道的文件的当前大小,该条语句执行后，通道位置处于文件的末尾
        fc.position(fc.size());
        System.out.println("此通道的文件位置：" + fc.position());
        // 在文件末尾写入字节
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();
        fos.close();

        //read
        FileInputStream fis = new FileInputStream("C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luomin\\net\\nio\\data.txt");
        fc = fis.getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while (buff.hasRemaining()) {
            System.out.print((char) buff.get());
        }
        fc.close();
        fis.close();

    }
}

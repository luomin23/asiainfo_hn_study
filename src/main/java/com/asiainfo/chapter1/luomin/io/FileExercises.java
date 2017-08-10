package com.asiainfo.chapter1.luomin.io;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;
import static java.awt.Color.red;
import static javax.swing.text.html.HTML.Tag.S;

/**
 * @author Luoo
 * @create 2017-07-31 11:09
 */

public class FileExercises {

    public static void main(String[] args) {

        try {
            RandomAccessFile raf = new RandomAccessFile("C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luomin\\demo\\he.txt", "rw");
            byte[] buf = "我".getBytes("UTF-8");

            System.out.println(buf.length);

            raf.write(buf);

            raf.seek(0);

            byte[] buf1 = new byte[10];

            int len = raf.read(buf1);

            System.out.println(len);

            String hello = new String(buf1,"UTF-8");
            System.out.println(hello);
            System.out.println(hello.getBytes("UTF-8").length);

            raf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

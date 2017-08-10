package com.asiainfo.chapter1.liuwy.August03;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Created by LENOVO on 2017/8/3.
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = null;
        FileInputStream fis = null;
        byte[] b = {65,67,69,71,70};
        int i=0;
        char c;

        try{
            // create new file output stream
            fos=new FileOutputStream("D://test.txt");

            // writes byte to the output stream
            fos.write(b, 1, 3);


            // flushes the content to the underlying stream
            fos.flush();

            // create new file input stream
            fis = new FileInputStream("D://test.txt");

            // read till the end of the file
            while((i=fis.read())!=-1)
            {
                // convert integer to character
                c=(char)i;

                // prints
                System.out.print(c);
            }
        }catch(Exception ex){
            // if an error occurs
            ex.printStackTrace();
        }finally{

            // closes and releases system resources from stream
            if(fos!=null)
                fos.close();
            if(fis!=null)
                fis.close();
        }
    }
}

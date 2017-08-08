package com.asiainfo.chapter1.fengzx.Aug04;

import java.io.*;

/**
 * Created by fengzx on 2017/8/4.
 */
public class CopyFolder {
    public static void main(String[] args) throws IOException{
        File srcFolder = new File("g:\\demo");
        if (!srcFolder.exists()){
            System.out.println("数据源有问题");
            System.exit(0);
        }

        File[] fileArray = srcFolder.listFiles();

        File destFolder = new File("g:\\test");
        if (!destFolder.exists()){
            destFolder.mkdir();
        }

        for (File file : fileArray){
            String name = file.getName();
            File destFile = new File(destFolder,name);

            copy(file,destFile);
        }
    }

    private static void copy(File file,File destFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}

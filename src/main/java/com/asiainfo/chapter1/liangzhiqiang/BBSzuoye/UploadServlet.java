package com.asiainfo.chapter1.liangzhiqiang.BBSzuoye;

/**
 * Created by 君不悔 on 2017/8/22.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;

public class UploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;  //接口的序列化，序列化类的兼容性

    public UploadServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");//更改响应字符流编码。

        //从request中获取文件信息
        InputStream fileSourceStream = request.getInputStream();
        String tempFileName = "F:\\yaxin\\Git\\asiainfo_hn_study\\src\\main\\webapp\\chapter1\\liangzhiqiang";
        //设置临时文件，保存待上传的文本输入流
        File tempFile = new File(tempFileName);
        //outputStream文件输出流指向之和tempFile
        FileOutputStream outputStream = new FileOutputStream(tempFile);
        //读取文件
        byte temp[] = new byte[1024];
        int n;
        while ((n = fileSourceStream.read(temp)) != -1) {
            outputStream.write(temp, 0, n);
        }
        outputStream.close();
        //获取上传文件的名称
        RandomAccessFile randomFile = new RandomAccessFile(tempFile, "r");
        randomFile.readLine();
        String str = randomFile.readLine();
        int start = str.lastIndexOf("=") + 2;
        int end = str.lastIndexOf("\"");
        String filename = str.substring(start, end);
        //定位文件指针到文件头
        randomFile.seek(0);
        long startIndex = 0;
        int i = 1;
        //获取文件内容的开始位置
        while ((n = randomFile.readByte()) != -1 && i <= 4) {
            if (n == '\n') {
                startIndex = randomFile.getFilePointer();
                i++;
            }
        }
        startIndex = startIndex - 1;           //前面多读了一个1
        //获取文件的结束位置
        randomFile.seek(randomFile.length());
        long endIndex = randomFile.getFilePointer();
        int j = 1;
        while (endIndex >= 0 && j <= 2) {
            endIndex--;
            randomFile.seek(endIndex);
            if (randomFile.readByte() == '\n') {
                j++;
            }

        }
//设置保存文件的路径
        String realPath = "F:\\yaxin\\Git\\asiainfo_hn_study\\src\\main\\webapp\\chapter1\\liangzhiqiang";
        File fileupload = new File(realPath);
        if (!fileupload.exists()) {
            fileupload.mkdir();
        }
        File saveFile = new File(realPath, filename);
        RandomAccessFile randomAccessFile = new RandomAccessFile(saveFile, "rw");
        //根据起始位置从文件中读取文件内容
        randomFile.seek(startIndex);
        while (startIndex < endIndex) {
            randomAccessFile.write(randomFile.readByte());
            startIndex = randomFile.getFilePointer();
        }
        //关闭输出输入流并删除临时文件
        randomAccessFile.close();

        randomFile.close();
        tempFile.delete();

        request.setAttribute("result", "文件上传成功");
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}






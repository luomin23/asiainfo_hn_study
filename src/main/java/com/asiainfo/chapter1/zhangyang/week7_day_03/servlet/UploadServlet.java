package com.asiainfo.chapter1.zhangyang.week7_day_03.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * Created by 11 on 2017/8/24.
 */

public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setSizeThreshold(1024*500);
        File temp = new File("G:\\Javaio");
        factory.setRepository(temp);
        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setFileSizeMax(1024*1024*5);
        try {
            List<FileItem> items = upload.parseRequest(request);
            for (FileItem item:items) {
                if (item.isFormField()){
                    String name = item.getFieldName();
                    String value = item.getString();
                    System.out.println("name:"+name+"value"+value);
                }else {
                    String fieldName = item.getFieldName();
                    String fileName =item.getName();
                    String contentType = item.getContentType();
                    long sizeInBytes= item.getSize();
                    System.out.println(fieldName);
                    System.out.println(fileName);
                    System.out.println(contentType);
                    System.out.println(sizeInBytes);
                    InputStream inputStream = item.getInputStream();
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    fileName="G:\\Javaio\\"+fileName;
                    OutputStream out = new FileOutputStream(fileName);
                    while ((len = inputStream.read(buffer))!=-1){
                        out.write(buffer,0,len);
                    }
                    out.close();
                    inputStream.close();
                }
                request.getRequestDispatcher("/chapter1/zhangyang/week7_day_03/filesuccess.jsp").forward(request,response);
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
            request.getRequestDispatcher("/chapter1/zhangyang/week7_day_03/filesuccess.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

package com.asiainfo.chapter1.liuwy.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.fileupload.disk.*;

// Servlet 文件上传
public class UploadServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String savepath=this.getServletContext().getRealPath("/WEB-INF/upload");
        File file=new File(savepath);
        System.out.println(savepath);
        if(!file.exists() && !file.isDirectory())
        {
            System.out.println(savepath+"目录不存在创建");
            file.mkdir();
        }

        String message="";

        try{
            System.out.println("1");
            DiskFileItemFactory fctory=new DiskFileItemFactory();
            ServletFileUpload fileuplaod=new ServletFileUpload(fctory);
            fileuplaod.setHeaderEncoding("UTF-8");
            if(!ServletFileUpload.isMultipartContent(request)){
                System.out.println("5");
                return;
            }
            System.out.println("6");
            List<FileItem> list=fileuplaod.parseRequest(request);
            for(FileItem item : list){
                if(item.isFormField()){
                    System.out.println("2");
                    String name=item.getFieldName();
                    String value=item.getString("UTF-8");
                    System.out.println(name+"="+value);

                }else{
                    System.out.println("3");
                    String name=item.getName();
                    System.out.println(name);
                    if(name==null||name.trim().equals("")){
                        continue;
                    }
                    name=name.substring(name.lastIndexOf("\\")+1);
                    InputStream in=item.getInputStream();
                    FileOutputStream out =new FileOutputStream(savepath+"\\"+name);
                    byte buffer[]=new byte[1024];
                    int len=0;
                    while((len=in.read(buffer))>0){
                        out.write(buffer, 0, len);;
                    }
                    System.out.println("4");
                    in.close();
                    out.close();
                    item.delete();
                    message="文件上传成功";

                }

            }

        }catch(Exception e){
            message="文件上传失败！";
            e.printStackTrace();

        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("chapter1//liuwy//demo//user//errmessage.jsp").forward(request, response);


    }


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request,response);
    }
}
package com.asiainfo.chapter1.hanjunwen.servlet.servletDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestUploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //读取请求Body
        byte[] body = readBody(req);
        //取得所有Body内容的字符串表示
        String textBody = new String(body,"ISO-8859-1");
        //取得上传文件的名字
        String filename =getFilename(textBody);
        Position p = getFilePosition(req,textBody);
        writeTo(filename,body,p);
    }
    class Position{
        int begin;
        int end;
        Position(int i, int begin){
            this.begin=begin;
            this.end=end;
        }
    }
//读取文件
    private byte[] readBody(HttpServletRequest request) throws IOException {
        int formDataLength=request.getContentLength();//获取数据的长度
        DataInputStream dataStream = new DataInputStream(request.getInputStream());//取得ServletInputStream对象
        byte body[] = new  byte[formDataLength];//设置数组的长度
        int totalBytes = 0;
        while (totalBytes<formDataLength){
            int bytes = dataStream.read(body,totalBytes,formDataLength);
            totalBytes+=bytes;
        }
        return body;
    }

    //取得文件开始与结束位置
    private Position getFilePosition(HttpServletRequest request, String textBody) throws UnsupportedEncodingException {
        //取得文件区段边界信息
        String contentType = request.getContentType();
        String boundaryText = contentType.substring(contentType.lastIndexOf("=")+1,contentType.length());
        //取得实际上传文件的起始与结束位置
        int pos = textBody.indexOf("filename=\"");
        pos = textBody.indexOf("\n",pos)+1;
        pos = textBody.indexOf("\n",pos)+1;
        pos = textBody.indexOf("\n",pos)+1;
        int boundaryLoc = textBody.indexOf(boundaryText,pos)-4;
        int begin=((textBody.substring(0,pos)).getBytes("ISO-8859-1")).length;
        int end = ((textBody.substring(0,boundaryLoc)).getBytes("ISO-8859-1")).length;
        return new Position(begin,end);
    }

    //获取文件名
    private String getFilename(String reqBody){
        String filename = reqBody.substring(reqBody.indexOf("filename=\"")+10);
        filename = filename.substring(0,filename.indexOf("\n"));
        filename = filename.substring(filename.lastIndexOf("\\")+1,filename.indexOf("\""));
        return filename;
    }
    //写入目标文件
    private void writeTo(String filename,byte[] body,Position p) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("e:/demo/"+filename);
        fileOutputStream.write(body,p.begin,(p.end-p.begin));
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}

package com.asiainfo.chapter1.wangjz.java.javaday1.Servlet2;

/**
 * Created by wjz123456 on 2017/8/18.
 */
public class MessageBean {
    private String author;
    private String title;
    private String content;
    private String time;
    public MessageBean(){

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

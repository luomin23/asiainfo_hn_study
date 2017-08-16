package com.asiainfo.chapter1.dongwenchao.web;

/**
 * Created by 超超 on 2017/8/15 0015.
 */
public class MessageBean {
    private String author;
    private String title;
    private String content;
    private String time;
    public MessageBean(){}

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

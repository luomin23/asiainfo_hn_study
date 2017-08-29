package com.asiainfo.chapter1.zhangle.BBSWorks.Entity;

/**
 * Created by del on 2017/8/24.
 */
public class Comment {
    private int id;
    private String username;
    private String comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

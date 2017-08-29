package com.asiainfo.chapter1.zhangle.BBSWorks.Entity;

import java.util.List;

/**
 * Created by del on 2017/8/25.
 */
public class PageInfo {
    private int page;  //当前页数
    private int num;  //每页数的个数
    private int total;//总页数
    private int pages;  //总页数
    private List comment;  //评论信息

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List getComment() {
        return comment;
    }

    public void setComment(List comment) {
        this.comment = comment;
    }
    public PageInfo(int page,int num,int total){
        this.page=page;
        this.total=total;
        this.num=num;
        if(this.total%this.num==0){
            this.pages=this.total / this.num;
        }else {
            this.pages=this.total / this.num+1;
        }
    }
}

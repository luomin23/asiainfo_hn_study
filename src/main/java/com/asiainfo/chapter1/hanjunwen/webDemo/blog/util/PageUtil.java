package com.asiainfo.chapter1.hanjunwen.webDemo.blog.util;


import com.asiainfo.chapter1.hanjunwen.webDemo.blog.entity.Blog;

import java.util.List;

public class PageUtil {
    int pageCount;//总页数
    int rows;//记录总数
    int rowsOfPage;//每页显示的记录数
    List<Blog> list;//结果集
    public int getPageCount(int rows ,int rowsOfPage){
        if(rows%rowsOfPage==0){
            return rows/rowsOfPage;
        }else {
            return rows/rowsOfPage+1;
        }

    }
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getRowsOfPage() {
        return rowsOfPage;
    }

    public void setRowsOfPage(int rowsOfPage) {
        this.rowsOfPage = rowsOfPage;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}

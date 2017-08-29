package com.asiainfo.chapter1.liuwy.demo;

import org.apache.commons.fileupload.util.LimitedInputStream;

import java.util.List;

/**
 * Created by LENOVO on 2017/8/24.
 */
public class PageVO<E>{
    private int page;
    private int pageCout;
    private int recordCount;
    private int recordOfPage;
    private List<E> listOfPage;

    public PageVO() {
    }

    public int getPage() {
        return page;
    }

    public int getPageCout() {
        return pageCout;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public int getRecordOfPage() {
        return recordOfPage;
    }

    public List<E> getListOfPage() {
        return listOfPage;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPageCout(int pageCout) {
        this.pageCout = pageCout;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public void setRecordOfPage(int recordOfPage) {
        this.recordOfPage = recordOfPage;
    }

    public void setListOfPage(List<E> listOfPage) {
        this.listOfPage = listOfPage;
    }
}

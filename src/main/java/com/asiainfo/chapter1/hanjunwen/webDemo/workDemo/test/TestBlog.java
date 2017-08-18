package com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.test;


import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.OperationBlogDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.dao.impl.OperationBlogDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.Blog;

import java.util.ArrayList;
import java.util.List;

public class TestBlog {
    public static void main(String[] args) {
        OperationBlogDAO obd=new OperationBlogDAOImpl();
        List<Blog> blogs=new ArrayList<Blog>();
        blogs=obd.selectBlogsByAuthor("123");
        for (int i =0; i <blogs.size() ; i++) {
            Blog blog=blogs.get(i);
            System.out.println(blog.getId());
            System.out.println(blog.getTitle());
            System.out.println(blog.getAuthor());
            System.out.println(blog.getArticle());
        }
    }


}

package com.asiainfo.chapter1.hanjunwen.webDemo.blog.test;

import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.OperationBlogDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao.dao.impl.OperationBlogDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.entity.Blog;

public class TestBlog {
    public static void main(String[] args) {
        OperationBlogDAO obd=new OperationBlogDAOImpl();
//        List<Blog> blogs=new ArrayList<Blog>();
//        blogs=obd.selectBlogsByAuthor("123");
//        for (int i =0; i <blogs.size() ; i++) {
//            Blog blog=blogs.get(i);
//            System.out.println(blog.getId());
//            System.out.println(blog.getTitle());
//            System.out.println(blog.getAuthor());
//            System.out.println(blog.getArticle());
//        }
        Blog blog=obd.getBlogById(14);
        System.out.println(blog.getArticle());
        System.out.println(blog.getId());
        System.out.println(blog.getTitle());
    }


}

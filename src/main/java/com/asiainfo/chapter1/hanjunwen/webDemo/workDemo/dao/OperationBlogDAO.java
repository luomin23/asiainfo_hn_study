package com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao;


import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.Blog;

import java.util.List;

public interface OperationBlogDAO {
    public Boolean addBlog(Blog blog);//添加博客
    public List<Blog> selectBlogsByAuthor(String author);//根据作者也就是用户名查询博客
    public boolean deleteBlogById(int id);//根据ID删除对应的博客
    public Blog getBlogById(int id);//根据文章ID获取博客
    public boolean updateBlogByUser(Blog blog); //用户更新已有Blog
}

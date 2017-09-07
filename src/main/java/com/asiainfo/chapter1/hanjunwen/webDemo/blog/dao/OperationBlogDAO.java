package com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao;



import com.asiainfo.chapter1.hanjunwen.webDemo.blog.entity.Blog;
import com.asiainfo.chapter1.hanjunwen.webDemo.blog.util.PageUtil;

import java.util.List;

public interface OperationBlogDAO {
    public Boolean addBlog(Blog blog);//添加博客
    public List<Blog> selectBlogsByAuthor(String author);//根据作者也就是用户名查询博客
    public boolean deleteBlogById(int id);//根据ID删除对应的博客
    public Blog getBlogById(int id);//根据文章ID获取博客
    public boolean updateBlogByUser(Blog blog); //用户更新已有Blog
    public List<Blog> selectBlogByAuthorWithPage(String author, int page);//简单的分页查询
    public PageUtil selectBlogsWithPage(String author, int page);//稍微复杂的分页查询
    public  int selectBlogsGetRows(String author);//拿到总的数据总记录数
    public PageUtil getAllBlogsWithPage(int page);//拿到所有的博客数
    public int getAllBlogsRows();//拿到数据库中所有的博客的记录数
}

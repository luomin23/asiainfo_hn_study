package com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.dao.impl;


import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.OperationBlogDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.Blog;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OperationBlogDAOImpl implements OperationBlogDAO {

    @Override
    public Boolean addBlog(Blog blog) {
        Connection conn = JdbcUtil.getConnection();
        PreparedStatement pst=null;
        String sql="insert into blog (title,article,author) values(?,?,?)";
        Boolean result=false;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,blog.getTitle());
            pst.setString(2,blog.getArticle());
            pst.setString(3,blog.getAuthor());
            pst.execute();
            result=true;
            pst.close();
            JdbcUtil.closeConnection(conn);
        } catch (SQLException e) {
            result=false;
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Blog> selectBlogsByAuthor(String author) {
        List<Blog> blogs=new ArrayList<Blog>();
        Connection conn=JdbcUtil.getConnection();
        PreparedStatement pst=null;
        ResultSet rs=null;

        String sql="select * from blog where author=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,author);
            rs=pst.executeQuery();
            while (rs.next()){
//                int id=rs.getInt("id");
                Blog blog=new Blog();
                blog.setId(rs.getInt("id"));
                blog.setTitle(rs.getString("title"));
                blog.setArticle(rs.getString("article"));
                blog.setAuthor(rs.getString("author"));
                blogs.add(blog);
            }
            rs.close();
            pst.close();
            JdbcUtil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return blogs;
    }

    @Override
    public boolean deleteBlogById(int id) {
        Connection conn=null;
        PreparedStatement pst=null;
        boolean result=false;
        String sql="delete from blog where id=?";
        try {
            conn=JdbcUtil.getConnection();
            pst=conn.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            result=true;
            pst.close();
            JdbcUtil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    public Blog getBlogById(int id) {
        Connection conn = JdbcUtil.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        Blog blog=new Blog();
        String sql="select * from blog where id=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1,id);
            rs=pst.executeQuery();
            while (rs.next()){
                blog.setId(rs.getInt("Id"));
                blog.setTitle(rs.getString("title"));
                blog.setArticle(rs.getString("article"));
                blog.setAuthor(rs.getString("author"));
            }
            rs.close();
            pst.close();
            JdbcUtil.closeConnection(conn);
            return blog;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return blog;
    }

    @Override
    public boolean updateBlogByUser(Blog blog) {
        Connection conn=JdbcUtil.getConnection();
        Boolean result = false;
        PreparedStatement pst=null;
        String sql="update blog set title=?,article=?,author=? where id=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,blog.getTitle());
            pst.setString(2,blog.getArticle());
            pst.setString(3,blog.getAuthor());
            pst.setInt(4,blog.getId());
            pst.executeUpdate();
            pst.close();
            JdbcUtil.closeConnection(conn);
            result=true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}

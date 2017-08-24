package com.asiainfo.chapter1.zhangle.BBSWorks.DAO.Implement;

import com.asiainfo.chapter1.zhangle.BBSWorks.DAO.CommentDAO;
import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.Comment;
import com.asiainfo.chapter1.zhangle.BBSWorks.JDBCUtil.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by del on 2017/8/24.
 */
public class CommentDAOImpl implements CommentDAO{
    @Override
    public List<Comment> selectAllComment(int s) {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<Comment> coms=new ArrayList<Comment>();
        try {
            conn= JDBC.getConnection();
            String sql="select comments from Comment limit ?,4";
            ps=conn.prepareStatement(sql);
            ps.setInt(1,(s-1)*4);  //1飘红时忽略掉错误即可
            rs=ps.executeQuery();
            while(rs.next()){
                Comment com=new Comment();
                com.setComments(rs.getString(1));
                coms.add(com);
            }


        } catch (ClassNotFoundException e) {
            System.out.println("找不到配置文件");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接失败");
        }catch (Exception e){
            System.out.println("未知异常");
            e.printStackTrace();
        }finally {
            JDBC.close(conn,ps,rs);
        }
        return coms;
    }
}

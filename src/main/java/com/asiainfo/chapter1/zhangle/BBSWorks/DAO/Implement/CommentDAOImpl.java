package com.asiainfo.chapter1.zhangle.BBSWorks.DAO.Implement;

import com.asiainfo.chapter1.zhangle.BBSWorks.DAO.CommentDAO;
import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.Comment;
import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.PageInfo;
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
    public PageInfo selectAllComment(int page, int pagecounts) {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<Comment> coms=new ArrayList<Comment>();
        PageInfo pageInfo=null;
        try {
            conn= JDBC.getConnection();
            //获取总数据条数
            int Counts = 0;
            ps = conn.prepareStatement("select count(comments) from Comment");
            rs = ps.executeQuery();
            while(rs.next()){
                Counts = rs.getInt(1);
            }
            int pagesn=0;
            if(Counts % pagecounts==0){
                pagesn=Counts /pagecounts;
            }else{
                pagesn=Counts / pagecounts+1;
            }
            if(page<=0){
                page=1;
            }else if(page>=pagesn){
                page=pagesn;
            }
            String sql="select comments from Comment limit ?,?";
            ps=conn.prepareStatement(sql);
            ps.setInt(1,(page-1)*pagecounts);  //1飘红时忽略掉错误即可
            ps.setInt(2,pagecounts);
            rs=ps.executeQuery();
            while(rs.next()){
                Comment com=new Comment();
                com.setComments(rs.getString(1));
                coms.add(com);
            }
            pageInfo=new PageInfo(page,pagecounts,Counts);
            pageInfo.setComment(coms);
            System.out.println("1-总个数"+pageInfo.getPages());
            System.out.println("1-页数"+pageInfo.getPage());

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
        return pageInfo;
    }
}

package com.asiainfo.chapter1.zhangle.BBSWorks.DAO;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.Comment;

import java.util.List;

/**
 * Created by del on 2017/8/24.
 */
public interface CommentDAO {

    List<Comment> selectAllComment(int s);
}

package com.asiainfo.chapter1.zhangle.BBSWorks.Service.Implement;

import com.asiainfo.chapter1.zhangle.BBSWorks.DAO.CommentDAO;
import com.asiainfo.chapter1.zhangle.BBSWorks.DAO.Implement.CommentDAOImpl;
import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.Comment;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.CommentService;

import java.util.List;

/**
 * Created by del on 2017/8/24.
 */
public class CommentServiceImpl implements CommentService {
    CommentDAO dao= new CommentDAOImpl();
    @Override
    public List<Comment> selectAllComment(int s) {
        List<Comment> comment=dao.selectAllComment(s);
        return comment;
    }
}

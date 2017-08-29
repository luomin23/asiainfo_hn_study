package com.asiainfo.chapter1.zhangle.BBSWorks.DAO;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.Comment;
import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.User;

import java.util.List;

/**
 * Created by del on 2017/8/21.
 */
public interface UserDAO {
    User selectByTell(String telephone);
    public List<User> selectAll();
    public void insertUser(User user);
    public void modityUser(String name,String email,String tele);

}

package com.asiainfo.chapter1.zhangle.BBSWorks.Service.Implement;

import com.asiainfo.chapter1.zhangle.BBSWorks.DAO.Implement.UserDAOImpl;
import com.asiainfo.chapter1.zhangle.BBSWorks.DAO.UserDAO;
import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.Comment;
import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.User;
import com.asiainfo.chapter1.zhangle.BBSWorks.Service.UserService;

/**
 * Created by del on 2017/8/21.
 */
public class UserServiceImpl implements UserService {
    UserDAO dao=new UserDAOImpl();
    @Override
    public void insertUser(User user) {
       dao.insertUser(user);
    }

    @Override
    public User selectByTelephone(String telephone) {
        User user=dao.selectByTell(telephone);
        return user;
    }

    @Override
    public void updateUser(String name, String email,String tele) {
        dao.modityUser(name,email,tele);
    }


}

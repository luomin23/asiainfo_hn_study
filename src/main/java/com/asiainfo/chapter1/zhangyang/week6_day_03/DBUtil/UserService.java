package com.asiainfo.chapter1.zhangyang.week6_day_03.DBUtil;

import com.asiainfo.chapter1.zhangyang.week6_day_03.Entity.User;

/**
 * Created by 11 on 2017/8/16.
 */
public class UserService {
    User u1  = new User("张扬","1","男");
    User u2  = new User("张大扬","12","男");
    User u3  = new User("张小扬","123","男");
    User[] users = {u1,u2,u3};
    //创建数组存储对象
    public User userLogin(String username){
        User u =null;
        for (User user :users){
            if (username.equals(user.getName())){
                u =user;
            }
        }
        return u;
    }
}

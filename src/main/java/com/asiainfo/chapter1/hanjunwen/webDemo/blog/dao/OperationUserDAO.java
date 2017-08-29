package com.asiainfo.chapter1.hanjunwen.webDemo.blog.dao;

import com.asiainfo.chapter1.hanjunwen.webDemo.blog.entity.User;

//操作用户
public interface OperationUserDAO {
   public boolean addUser(User user);//添加新用户
   public User selectUserByUsername(String name);//通过用户名查找用户
   public Boolean checkUser(User user);//检查用户
   public Boolean updateUserOfPwd(User user);//更新用户密码
}

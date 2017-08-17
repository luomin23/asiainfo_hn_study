package com.asiainfo.chapter1.hanjunwen.webDemo.loginDemo.dao;


import com.asiainfo.chapter1.hanjunwen.webDemo.loginDemo.entity.User;

//操作用户
public interface OperationUser {
   public User selectUserByUsername(String name);
}

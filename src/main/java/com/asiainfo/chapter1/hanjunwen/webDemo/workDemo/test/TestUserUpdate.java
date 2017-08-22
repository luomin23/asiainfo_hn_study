package com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.test;


import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.OperationUserDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.dao.impl.OperationUserDAOImpl;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.User;

public class TestUserUpdate {
    public static void main(String[] args) {
        User user=new User();
        user.setUserName("123");
        user.setPwd("12");

        OperationUserDAO ou = new OperationUserDAOImpl();
        if(ou.updateUserOfPwd(user)){
            System.out.println("更改成功！");
        }else {
            System.out.println("更新失败 ");
        }
    }
}

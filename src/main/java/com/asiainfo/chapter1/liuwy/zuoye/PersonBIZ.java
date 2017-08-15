package com.asiainfo.chapter1.liuwy.zuoye;



import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by LENOVO on 2017/8/13.
 */
public class PersonBIZ {
    public boolean save(Person person){
        com.asiainfo.chapter1.liuwy.August08.PersonDao personDao=new com.asiainfo.chapter1.liuwy.August08.PersonDao();
        try {
            try {
                personDao.save(person);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            DBUtils.closeConnection();
        }
    }

    public Person findByPhone(int phonenumber){
        com.asiainfo.chapter1.liuwy.August08.PersonDao personDao=new com.asiainfo.chapter1.liuwy.August08.PersonDao();
        try {
            return personDao.findByPhone(phonenumber);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            DBUtils.closeConnection();
        }
    }
}

package com.asiainfo.chapter1.zhangyang.week7_day_03.dao;

import com.asiainfo.chapter1.zhangyang.week7_day_03.entity.Person;

/**
 * Created by 11 on 2017/8/23.
 */
public interface PersonDao {
    public void insertUser(Person person);
    public Person selectPersonByUsername(String name);
    public boolean checkPerson(Person p);
}

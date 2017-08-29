package com.asiainfo.chapter1.zhangyang.week7_day_03.dao;

import com.asiainfo.chapter1.zhangyang.week7_day_03.entity.Student;

import java.util.List;

/**
 * Created by 11 on 2017/8/23.
 */
public interface StudentDao {
    public void insertStudent(Student student);
    public List<Student> getAllStudent(int currentpageno);
    public Student getStudent(String sno);
    public List<Student> queryStudent(String name);
    public void delete(String sno);
    public void update(Student student);
    public  int getPageCount();
}

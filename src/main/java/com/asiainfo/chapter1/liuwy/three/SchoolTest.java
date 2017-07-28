package com.asiainfo.chapter1.liuwy.three;

import java.util.Scanner;

/**
 * Created by LENOVO on 2017/7/26.
 */
public class SchoolTest {
    public static void main(String[] args) {
        LanguageTeacher languageTeacher = new LanguageTeacher("英语老师", 40,
                1000, "英语", "专业10级");
        ComputetTeacher computerTeacher = new ComputetTeacher("peter", 25,
                9999999, "JavaEE", "架构师");
        AccountantTeacher accountantTeacher = new AccountantTeacher("注老师", 50,
                1001, "C10010", "2015年");

        School school = new School();
        school.printa(accountantTeacher);

    }
}

package com.asiainfo.chapter1.fengzx.Aug04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by fengzx on 2017/8/4.
 */
public class StudentDemo {
    public static void main(String[] args) throws IOException{
        System.out.println("学生信息操作开始");
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num2 = num ==0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
                int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
                int num5 = num4 == 0 ? s1.getName().compareTo(s2.getName()) : num4;
                return num5;
            }
        });
        for (int x = 1;x <= 5; x++){
            System.out.println("请输入第"+x+"个学生信息");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            String[] datas = line .split("，");
            String name = datas[0];
            int chinese = Integer.parseInt(datas[1]);
            int math = Integer.parseInt(datas[2]);
            int english = Integer.parseInt(datas[3]);

            //Student s = new Student(name,chinese,math,english);
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);
            ts.add(s);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("stu.txt"));
        bw.write("姓名，语文成绩，数学成绩，英语成绩");
        bw.newLine();
        bw.flush();

        for (Student s : ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append("，").append(s.getChinese()).append("，").append(s.getMath()).append("，").append(s.getEnglish());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
        System.out.println("学生信息操作完毕");
    }
}

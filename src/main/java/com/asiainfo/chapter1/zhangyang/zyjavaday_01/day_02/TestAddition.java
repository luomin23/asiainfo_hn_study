package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
        import java.util.Scanner;
public class TestAddition {
    public static void main(String[] args) {
        System.out.println("����ʼ10�μӷ�����...");
        Scanner scan = new Scanner(System.in);
        // ��¼����
        int Total = 0;
        // ���� 10 ��ѭ��
        for (int i = 1; i <= 10; i++) {
            // ���������������
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            int result = a + b;
            // �����Ҫ����ļӷ����ʽ
            System.out.println("(" + i + "). " + a + " + " + b + " = ?");
            System.out.print("������𰸣�����-1�˳����� ");
            // ������
            int answer = scan.nextInt();
            // �ж϶Դ�
            if (answer == -1) {
                break;
            } else if (answer != result) {
                System.out.println("Error!");
                continue;
            } else {
                Total += 10;
                System.out.println("Correct!");
            }
        }
        scan.close();
        System.out.println("�˴β����������ķ����ǣ�" + Total);
    }
}

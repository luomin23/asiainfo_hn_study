package com.asiainfo.chapter1.sgf;
import java.util.Random;
import java.util.Scanner;

public class Money {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//����
		/*System.out.println("�������Ʒ����");
		float fPrice = input.nextFloat();
		System.out.println("�������Ʒ����");
		int num = input.nextInt();
		System.out.println("�����븶����");
		int payMoney = input.nextInt();
		float allPrice = fPrice*num;
		if(allPrice>=500){
			if(payMoney>=allPrice*0.8){
				System.out.println("Ӧ�ս��Ϊ:"+allPrice*0.8+",����ǮΪ"+(payMoney-allPrice));				
			}else{
				System.out.println("����Ǯ������");
			}
		}else{
			if(payMoney>=allPrice){				
				System.out.println("Ӧ�ս��Ϊ:"+allPrice+",����ǮΪ"+(payMoney-allPrice));
			}else{
				System.out.println("�������");
			}
		}*/
		//�����ɼ�
		/*System.out.println("�������ѧ���ķ���");
		float fGrade = input.nextFloat();
		boolean flag = false;
		if(fGrade>100){
			System.out.println("����ĳɼ���Ϣ����");
		}else{
			flag=true;
		}
		if(flag){
			if(fGrade>=90){
				System.out.println("A");
			}else if(fGrade>=80){
				System.out.println("B");
			}else if(fGrade>=60){
				System.out.println("C");
			}else{
				System.out.println("D");
			}
		}
		 */
		//��������Ϸ
		/*Random random = new Random();
		int randomNum = random.nextInt(1000);
		System.out.println(randomNum);
		while (true) {
			System.out.print("��������²�1-1000�����֣��˳��밴0:");
			int iNum = input.nextInt();
			if(iNum==0){
				System.out.println("���ź��´�����ս��");
				System.exit(0);
			}
			if(iNum>randomNum){
				System.out.println("̫����");
			}else if(iNum<randomNum){
				System.out.println("̫С��");
			}else{
				System.out.println("��ϲ��¶���");
			}
		}*/
		
		//����ӷ�������
	/*	System.out.println("����ʼʮ�μӷ�����");
		Random random = new Random();
		int sumGrade = 0;
		for(int i = 0;i<10;i++){
			int randomNumFirst = random.nextInt(100);
			int randomNumLast = random.nextInt(100);
			System.out.println("��"+(i+1)+"��:"+randomNumFirst+"+"+randomNumLast);
			System.out.print("�������");
			int m = input.nextInt();
			if(m==-1){
				System.out.println("�˴β��Խ���");
				System.out.println("��ĳɼ�Ϊ"+sumGrade+"��");
				System.exit(0);
			} 
			if(m==(randomNumFirst+randomNumLast)){
				System.out.println("correct");
				sumGrade +=10;
			}else{
				System.out.println("error");
			}
		}
		System.out.println("�ܳɼ�Ϊ��"+sumGrade+"��");*/
	
		//�žų˷���
		/*for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}*/
		
		//����������Ԫ�ص����ֵ
		int[] arr = new int[10];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=random.nextInt(100);
		}
		System.out.print("����Ԫ��Ϊ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		int max = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max){
				max=arr[i];
				index = i;
			}
		}
		System.out.println("���ֵΪ��"+max);
		
		//������Ԫ�ص����ֵ�ŵ����һ��λ��
		System.out.print("�µ�����Ԫ��Ϊ");
		for (int i = 0; i < arr.length; i++) {
			if(i<index){
			}else if(i != arr.length-1){
				arr[i]=arr[i+1];
			}else {
				arr[i]=max;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		System.out.println("...........ð�ݳ���.................");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
				}
			}
			
			System.out.print("��"+i+1+"������");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]+",");
			}
			System.out.println();
		}
		
		System.out.println("........�����.........");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}

package fqtest;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int sum=0,number1,number2,number3;
		Scanner can=new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			number1=ran.nextInt(100);
			number2=ran.nextInt(100);
			System.out.println("("+(i+1)+") "+number1+"*"+number2+"= ?");
			number3=can.nextInt();
			if(number3==-1){
				break;
				
			}else{
				if(number3==(number1*number2)){
					System.out.println("Correct");
					sum+=10;
				}else{
				    System.out.println("Error");
				}
				
			}
			
		}
		System.out.println("本次测验结束，你的分数为："+sum);
		
		
		

}


		}

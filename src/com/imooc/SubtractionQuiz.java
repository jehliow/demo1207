package com.imooc;

import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=(int)(Math.random()*10);
		int num2=(int)(Math.random()*10);
		if(num1<num2){
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		
		System.out.println("����"+num1+"��ȥ"+num2+"���ڶ��٣�");
		Scanner input=new Scanner(System.in);
		int answer=input.nextInt();
		if(answer==(num1-num2))
			System.out.println("�ش���ȷ");
		else
			System.out.println("��Ļش��Ǵ����\n"+num1+"-"+num2+"="+(num1-num2));
		
	}

}

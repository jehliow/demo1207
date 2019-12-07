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
		
		System.out.println("请问"+num1+"减去"+num2+"等于多少？");
		Scanner input=new Scanner(System.in);
		int answer=input.nextInt();
		if(answer==(num1-num2))
			System.out.println("回答正确");
		else
			System.out.println("你的回答是错误的\n"+num1+"-"+num2+"="+(num1-num2));
		
	}

}

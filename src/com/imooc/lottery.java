package com.imooc;

import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery=(int)(Math.random()*100);
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你购买彩票的两位数：");
		int guess=input.nextInt();
		int lottery1=lottery/10;
		int lottery2=lottery%10;
		int guess1=guess/10;
		int guess2=guess%10;
		System.out.println("彩票开出的号码为："+lottery);
		if(guess==lottery)
		System.out.println("恭喜你获得1等奖，奖金为10000元");
		else if(guess1==lottery2&&guess2==lottery1)
		System.out.println("恭喜你获得2等奖，奖金为5000元");
		else if(guess1==lottery1||guess1==lottery2||guess2==lottery1||guess2==lottery2)
		System.out.println("恭喜你获得3等奖，奖金为1000元");
		else
		System.out.println("对不起，你没中奖");
	}

}

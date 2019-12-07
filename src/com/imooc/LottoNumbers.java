package com.imooc;

import java.util.Scanner;

public class LottoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] isCoverd=new boolean[99];
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		while(number!=0){
			isCoverd[number-1]=true;
			number=input.nextInt();
		}
		boolean allCoverd=true;
		for(int i=0;i<99;i++)
			if(!isCoverd[i]){
				allCoverd=false;
				break;
			}
		if(allCoverd)
			System.out.println("彩票覆盖了所有数字！");
		else
			System.out.println("彩票没有覆盖所有数字！");
		
	}

}

package com.imooc;

import java.util.Scanner;

public class FutureTuition {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("�������һ������");
	int num1=input.nextInt();
	System.out.print("������ڶ�������");
	int num2=input.nextInt();
	System.out.println(num1+"��"+num2+"���Լ���ǣ�"+gcd(num1,num2));
	}
	public static int gcd(int n1,int n2){
		int gcd=1;
		int k=2;
		while(k<=n1&&k<=n2){
			if(n1%k==0&&n2%k==0)
				gcd=k;
			k++;
		}
		return gcd;
	}
	
}

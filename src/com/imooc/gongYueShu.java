package com.imooc;

import java.util.Scanner;

public class gongYueShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ��������");
		int n1=input.nextInt();
		System.out.print("������ڶ���������");
		int n2=input.nextInt();
		System.out.println("����"+n1+"����"+n2+"�����Լ��"+gcd(n1,n2));	
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

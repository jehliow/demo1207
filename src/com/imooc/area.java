package com.imooc;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI=3.14159;
		Scanner input=new Scanner(System.in);
		System.out.print("������뾶��С��");
		double radius=input.nextDouble();
		double area=radius*radius*PI;
		System.out.println("Բ������ǣ�"+area);
		System.out.println("��������������");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		double num3=input.nextDouble();
		double avg=(num1+num2+num3)/3;
		System.out.println("3������ƽ�����ǣ�"+avg);
	}

}

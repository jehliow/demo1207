package com.imooc;

import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery=(int)(Math.random()*100);
		Scanner input=new Scanner(System.in);
		System.out.print("�������㹺���Ʊ����λ����");
		int guess=input.nextInt();
		int lottery1=lottery/10;
		int lottery2=lottery%10;
		int guess1=guess/10;
		int guess2=guess%10;
		System.out.println("��Ʊ�����ĺ���Ϊ��"+lottery);
		if(guess==lottery)
		System.out.println("��ϲ����1�Ƚ�������Ϊ10000Ԫ");
		else if(guess1==lottery2&&guess2==lottery1)
		System.out.println("��ϲ����2�Ƚ�������Ϊ5000Ԫ");
		else if(guess1==lottery1||guess1==lottery2||guess2==lottery1||guess2==lottery2)
		System.out.println("��ϲ����3�Ƚ�������Ϊ1000Ԫ");
		else
		System.out.println("�Բ�����û�н�");
	}

}

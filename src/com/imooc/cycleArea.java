package com.imooc;
import java.util.Scanner;
public class cycleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("������Բ����İ뾶��");
		double radius=input.nextDouble();
		System.out.print("������Բ����ĸߣ�");
		double length=input.nextDouble();
		double area=Math.pow(radius,2)*Math.PI;
		double volume=area*length;
		System.out.println("Բ��������Ϊ��"+area);
		System.out.println("Բ��������Ϊ��"+volume);
	}

}

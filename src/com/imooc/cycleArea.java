package com.imooc;
import java.util.Scanner;
public class cycleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入圆柱体的半径：");
		double radius=input.nextDouble();
		System.out.print("请输入圆柱体的高：");
		double length=input.nextDouble();
		double area=Math.pow(radius,2)*Math.PI;
		double volume=area*length;
		System.out.println("圆柱体的面积为："+area);
		System.out.println("圆柱体的体积为："+volume);
	}

}

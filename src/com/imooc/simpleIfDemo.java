package com.imooc;
import java.util.Scanner;
public class simpleIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("ÊäÈëÕûÊı£º");
		int number=input.nextInt();
		if(number%5==0){
			System.out.println("HiFive");
		}
		else{
			System.out.println("HiEven");
		}
	}

}

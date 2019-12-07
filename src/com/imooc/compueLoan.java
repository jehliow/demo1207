package com.imooc;
import java.util.Scanner;
public class compueLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年利率：");
		double yIrate=input.nextDouble();
		System.out.print("请输入年数：");
		double numberOfYear=input.nextDouble();
		System.out.print("请输入贷款总额：");
		double loanAmount=input.nextDouble();
		double monthlyInterestRate=yIrate/1200;
		double monthlyPayment=loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate, numberOfYear*12));
		double totalPayment=monthlyPayment*numberOfYear*12;
		System.out.println("月支付额："+monthlyPayment);
		System.out.println("总支付额："+totalPayment);
	}

}

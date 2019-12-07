package com.imooc;
import javax.swing.JOptionPane;
public class compute2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yIrateString=JOptionPane.showInputDialog("请输入年利率:");
		double yIrate=Double.parseDouble(yIrateString);
		double monthlyInterestRate=yIrate/1200;
		String numberOfYearsString=JOptionPane.showInputDialog("请输入年数：");
		int numberOfYears=Integer.parseInt(numberOfYearsString);
		String loanString=JOptionPane.showInputDialog("请输入总额：");
		double loanAmount=Double.parseDouble(loanString);
		double monthlyPayment=loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate, numberOfYears*12));
		double totalPayment=monthlyPayment*numberOfYears*12;
		String output="月支付额："+monthlyPayment+"\n年支付额："+totalPayment;
		JOptionPane.showConfirmDialog(null, output);
		

	}

}

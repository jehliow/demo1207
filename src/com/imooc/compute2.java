package com.imooc;
import javax.swing.JOptionPane;
public class compute2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yIrateString=JOptionPane.showInputDialog("������������:");
		double yIrate=Double.parseDouble(yIrateString);
		double monthlyInterestRate=yIrate/1200;
		String numberOfYearsString=JOptionPane.showInputDialog("������������");
		int numberOfYears=Integer.parseInt(numberOfYearsString);
		String loanString=JOptionPane.showInputDialog("�������ܶ");
		double loanAmount=Double.parseDouble(loanString);
		double monthlyPayment=loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate, numberOfYears*12));
		double totalPayment=monthlyPayment*numberOfYears*12;
		String output="��֧���"+monthlyPayment+"\n��֧���"+totalPayment;
		JOptionPane.showConfirmDialog(null, output);
		

	}

}

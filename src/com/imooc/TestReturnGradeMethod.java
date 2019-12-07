package com.imooc;

public class TestReturnGradeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The grade is"+getGrade(0));
		System.out.println("The grade is"+getGrade(80));
	}
	public static char getGrade(double score){
		if(score>90.0)
			return 'A';
		else if(score>=80.0)
			return 'B';
		else
			return 'C';
	}

}

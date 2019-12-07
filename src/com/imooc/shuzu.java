package com.imooc;
import java.util.*;
public class shuzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matirx=new int[3][4];
		Scanner input=new Scanner(System.in);
		System.out.println("输入"+matirx.length+"行和"+matirx[0].length+"列：");
		for (int i=0;i<matirx.length;i++)
			for(int j=0;j<matirx[i].length;j++)
				matirx[i][j]=input.nextInt();
			System.out.println("\n所有元素总和是"+sum(matirx));	
	}	
	public static int sum(int[][] matirx){
		int total=0;
		for(int row=0;row<matirx.length;row++){
			for(int column=0;column<matirx[row].length;column++){
				total +=matirx[row][column];
			}
		}
		return total;
	}	
}

package com.imooc;

import java.util.Arrays;

public class shuzu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[]{1,10,100,99,76};
		int max=num[0];
		int min=num[0];
		int sum=0;
		for(int i=0;i<num.length;i++){
			if(max<num[i]){
				max=num[i];
			}
			if(num[i]<min){
				min=num[i];
			}
			sum=sum+num[i];
		}
			int avg=sum/num.length;
			
			int[] scores=new int[]{5,9,29,33,98};
			
			for(int score:scores){
				System.out.print(score+"   ");
			}
		System.out.println("");	
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
		System.out.println("平均值："+avg);
		System.out.println(Arrays.toString(num));
	}

}

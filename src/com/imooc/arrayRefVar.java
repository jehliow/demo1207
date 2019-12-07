package com.imooc;

public class arrayRefVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList=new double[5];
		for(int i=0;i<myList.length;i++){
			myList[i]=(int)(Math.random()*10);
			System.out.println(myList[i]+"");
		}
		
		double[] myList2={5,9,19,10,100,101,0};	
		double max=myList2[0];
		for(int j=0;j<myList2.length;j++){
			if(myList2[j]>max) max=myList2[j];
			
		}
		System.out.println(max);
		
	}

}

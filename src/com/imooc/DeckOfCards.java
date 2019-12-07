package com.imooc;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deck=new int[52];
		String[] suits={"ºÚÌÒ","ºìĞÄ","×êÊ¯","Ã·»¨"};
		String[] ranks={"Ace","2","3","4","5","6","7","8","9","10"
				,"jack","Queen","King"};
		for(int i=0;i<deck.length;i++){
			deck[i]=i; 
		}
		for(int i=0;i<deck.length;i++){
			int index=(int)(Math.random()*deck.length);
			int temp=deck[i];
			deck[i]=deck[index];
			deck[index]=temp;
		}	
		for(int i=0;i<13;i++){
			String suit=suits[deck[i]/13];
			String rank=ranks[deck[i]%13];
			System.out.println(suit+rank);
		}
	}

}

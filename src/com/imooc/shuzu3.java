package com.imooc;

public class shuzu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] answer={
				{'A','B','C','D','D','D','A','B','A','A'},
				{'C','C','D','C','B','A','A','B','A','A'},
				{'D','D','D','A','A','B','A','B','A','A'},
				{'D','C','B','A','A','B','A','B','A','A'},
				{'D','D','D','A','A','B','A','B','A','A'},
				{'B','D','D','A','A','B','A','B','A','A'},
				{'A','B','D','A','A','B','A','B','A','A'},
				{'C','C','D','A','A','B','A','B','A','A'}
		};
		char[] keys={'A','B','C','D','A','B','C','D','A','B'};
		for(int i=0;i<answer.length;i++){
			int correctCount=0;
			for(int j=0;j<answer[i].length;j++){
				if(answer[i][j]==keys[j]){
					correctCount++;
					
				}
			System.out.println("第"+(i+1)+"学生答对"+correctCount+"道题");
			}
		}
	}

}

package com.java.examples.BubbleSort;

public class BubbleSortClass {

	public static void main(String[] args) {
		
		int randomNum[] = {20,16,9,7,1};
		int k;
		for(int i=0;i<randomNum.length;i++){
			
			for(int j=1;j<(randomNum.length)-i;j++){
			
				 if(randomNum[j-1] > randomNum[j]){
				k=randomNum[j-1];
				randomNum[j-1] = randomNum[j];
				randomNum[j] =k;
			}
		}
			for(int num : randomNum){
				System.out.println(num);
			}
		
	}

}
}

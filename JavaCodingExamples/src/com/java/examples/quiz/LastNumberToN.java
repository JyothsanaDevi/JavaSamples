package com.java.examples.quiz;

import java.util.Scanner;

public class LastNumberToN {

	public static void main(String[] args){
		int[] arr = {6,10,4,23,8};
		int beg =arr[0];
		int last =arr.length-1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number for count: ");
		int j=scan.nextInt();
		int count=0;
		while(count!=j){
			System.out.println(arr[last]);
			last--;
			count++;
		}
		
	}
}

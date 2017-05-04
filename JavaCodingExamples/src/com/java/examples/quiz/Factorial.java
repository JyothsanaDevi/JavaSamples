package com.java.examples.quiz;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=scan.nextInt();
		int num1=num;
		int j=num-1;
		while(j>0){
			int mul=num*j;
			j--;
			num=mul;
		}
       System.out.println("Factorial of " + num1 + "is: " + num);
	}

}

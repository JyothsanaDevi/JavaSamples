package com.java.examples.quiz;

import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num =scan.nextInt();
		int i=1;
		while(i<=num){
			int r=i%2;
			if(i%3==0 &&  i%5==0){
				System.out.println("fizzbuzz");
			}
			else if( i%3==0){
				System.out.println("fizz");
			}
			else if( i%5==0){
				System.out.println("Buzz");
			}
			
			else{
			System.out.println(i);
			}
			i++;
		}
		
	}

}

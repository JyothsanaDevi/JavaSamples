package com.java.examples.StringExamples;

import java.io.IOException;
import java.util.Scanner;

public class CountCharsInString {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = scan.nextLine();
		System.out.println("Enter any character");
		char ch=(char)System.in.read();
		int countCh = 0;
		for(int i=0;i<str.length();i++){
			char c=	str.charAt(i);
			if(c==ch){
				countCh++;
			}
		}
		System.out.println("number of times the character is repeated is: " +countCh);
	}

}

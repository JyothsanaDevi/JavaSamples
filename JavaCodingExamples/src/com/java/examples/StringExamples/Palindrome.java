package com.java.examples.StringExamples;

public class Palindrome {
	
/*
 * This is palidrome for Strings.
 */

//	public static void main(String[] args) {
//		String str="level";
//		StringBuffer sb = new StringBuffer();
//		
//		for(int i=(str.length())-1;i>=0;i--){
//			char ch=str.charAt(i);
//			sb.append(ch);
//			
//		}
//     System.out.println(sb);
//	}
//
//}
/*
 * This is palindrome for numbers.	
 */
	
public static void main(String[] args) {
	
	int r,s = 0;
	int n=101;
	for(int i=0;n!=0;i++){
		r=n%10;
		System.out.println(r);
		n=n/10;
		System.out.println(n);
		s=s*10+r;
	}
	System.out.println("Palindrome : " +s);
}
}

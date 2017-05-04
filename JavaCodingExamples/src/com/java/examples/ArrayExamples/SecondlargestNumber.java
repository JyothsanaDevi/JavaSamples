package com.java.examples.ArrayExamples;

import java.util.Arrays;

public class SecondlargestNumber {

	public static void main(String[] args) {
		 int[] numbers = {4,20,25,6,16};
		 Arrays.sort(numbers);
		 System.out.println(numbers[numbers.length -2]);
			}
   
}

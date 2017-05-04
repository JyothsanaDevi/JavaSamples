package com.java.examples.ArrayExamples;

import java.util.Arrays;
import java.util.Collections;

public class SortNumbers {

	public static void main(String[] args) {
		
		String array[] = {"Hi","Me","You","Myself","Yourself"};
		Arrays.sort(array);
		for(String str:array){
			System.out.println(str);
		}
		System.out.println("Sorting using comparator");
		Arrays.sort(array, Collections.reverseOrder());
		for(String str:array){
			System.out.println(str);
		}

	}

}

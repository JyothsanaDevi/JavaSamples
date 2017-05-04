package com.java.examples.StringExamples;

import java.util.HashSet;
import java.util.Set;

public class DupsRemovalExample {

	public static void main(String[] args) {
		String str = "Jyothsana";
		System.out.println(dupsRemoval(str));

	}
	
	public static String dupsRemoval(String str){
		Set<Character> set = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				sb.append(c);
			}
			
		}
		
		return sb.toString();
		
	}

}

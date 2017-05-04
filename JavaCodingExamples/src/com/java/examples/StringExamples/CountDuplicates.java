package com.java.examples.StringExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplicates {

	public static void main(String[] args) {
		
		String data = "aaabbccc";
		findDups(data);
	}
	
	public static void findDups(String data){
		Map<Character , Integer> map = new HashMap<Character, Integer>();
		char[] cArray = data.toCharArray();
		for(char c: cArray){
			if(!map.containsKey(c)){
				map.put(c, 1);
			}
			else{
				map.put(c, map.get(c)+1);
			}
		}
			Set<Map.Entry<Character,Integer>>entrySet = map.entrySet();
			for(Map.Entry<Character, Integer> entry :entrySet ){
				if(entry.getValue() > 1){
					//System.out.printf("%s: %d %n",entry.getKey(), entry.getValue());
					//System.out.printf(" %c " , entry.getKey());
					System.out.printf(" %d %n"+" %c \n" , entry.getValue(),entry.getKey());
				}
			}
			for(Map.Entry<Character, Integer> entry :entrySet ){
				if(entry.getValue() > 1){
					int n= entry.getValue();
					while(n!=0){
						System.out.printf("%c", entry.getKey());
						n--;
					}
					
				}
			}
		
	}

}

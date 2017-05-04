package com.java.examples.quiz;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable {

	public static void main(String args[]){
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("one", "Apple");
		ht.put("two", "Mango");
		ht.put("three", "Banana");
		ht.put("four", "Orange");
		ht.put("five", "Mellon");
		
		for(Entry<String, String> itm: ht.entrySet()){
			System.out.println(itm.getKey() + " : " + itm.getValue());
		}
		
	}
}

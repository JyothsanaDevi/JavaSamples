package com.java.examples.HashMapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapClass {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(200,"Rose");
		map.put(101, "Dog");
		map.put(5, "Tiger");
		map.put(116, "Adam");
		
		for(Map.Entry<Integer, String> entry :map.entrySet()){
			
			System.out.println(entry.getKey());
		}
		System.out.println("After Sorting");
       Map<Integer, String> treeMap = new TreeMap<Integer, String>(map);	
       for(Map.Entry<Integer, String> entry :treeMap.entrySet()){
			
			System.out.println(entry.getKey());
		}
       
       
		

	}

}

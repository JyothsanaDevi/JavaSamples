package com.java.examples.quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.java.examples.quiz.Merge;
public class FrequencyCount {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	String line = scan.nextLine();
        // read in the words as an array
        String[] words = line.split("\\s+");

        // sort the words
        Merge.sort(words);
        int word = words.length;
        Map<Character , Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<words.length;i++){
        	String data = new String();
        	data = words[i];
        	System.out.println(words[i]);
        	char[] cArray = data.toCharArray();
    		for(char c: cArray){
    			if(!map.containsKey(c)){
    				map.put(c, 1);
    			}
    			else{
    				map.put(c, map.get(c)+1);
    			}
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
        System.out.println(word);

//        // tabulate frequencies of each word
//        Counter[] zipf = new Counter[words.length];
//        int m = 0;                                        // number of distinct words
//        for (int i = 0; i < words.length; i++) {
//            if (i == 0 || !words[i].equals(words[i-1]))   // short-circuiting OR
//                zipf[m++] = new Counter(words[i], words.length);
//            zipf[m-1].increment();
//        }
//
//        // sort by frequency and print
//        Merge.sort(zipf, 0, m);                           // sorting a subarray
//        for (int j = m-1; j >= 0; j--) {
//            StdOut.println(zipf[j]);
//        }
    }
}

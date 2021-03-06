package com.java.examples.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    // return the index of the key in the sorted array a[]; -1 if not found
    public static int search(String key, String[] a) {
        return search(key, a, 0, a.length);
    }
    public static int search(String key, String[] a, int lo, int hi) {
System.out.println("lo  = " + lo);
System.out.println("hi  = " + hi);
        // possible key indices in [lo, hi)
        if (hi <= lo) return -1;
        int mid = lo + (hi - lo) / 2;
        int cmp = a[mid].compareTo(key);
        if      (cmp > 0) return search(key, a, lo, mid);
        else if (cmp < 0) return search(key, a, mid+1, hi);
        else              return mid;
    }


    // whitelist, exception filter
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       String s = console.nextLine();
//    	In in = new In(args[0]);
//        String s = in.readAll();
        String[] words = s.split("\\s+");
        System.err.println("Done reading words");

        // sort the words (if needed)
        Arrays.sort(words);
        System.err.println("Done sorting words");

        // prompt user to enter a word and check if it's there
       
            String key = console.nextLine();
            if (search(key, words) < 0) System.out.println(key);
        
        console.close();
    }
}

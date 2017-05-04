package com.java.examples.quiz;

import org.apache.commons.lang3.time.StopWatch;

public class ThreeSum {

	    // print distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
	    public static void printAll(int[] a) {
	        int n = a.length;
	        for (int i = 0; i < n; i++) {
	            for (int j = i+1; j < n; j++) {
	                for (int k = j+1; k < n; k++) {
	                    if (a[i] + a[j] + a[k] == 0) {
	                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
	                    }
	                }
	            }
	        }
	    } 

	    // return number of distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
	    public static int count(int[] a) {
	        int n = a.length;
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = i+1; j < n; j++) {
	                for (int k = j+1; k < n; k++) {
	                    if (a[i] + a[j] + a[k] == 0) {
	                        count++;
	                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
	                    }
	                }
	            }
	        }
	        return count;
	    } 

	    public static void main(String[] args)  { 
	        int[] a = {2,5,-5,-7,3};
	        StopWatch timer = new StopWatch();
	        int count = count(a);
	       //System.out.println("elapsed time = " + timer.elapsedTime());
	       System.out.println(count);
	       printAll(a);
	    } 
	} 




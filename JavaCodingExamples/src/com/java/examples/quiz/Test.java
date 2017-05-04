package com.java.examples.quiz;

class Test {
	public static void main(String args[]) {
//	int x = -4;
//	System.out.println(x>>1); 
//	int y = 4;
//	System.out.println(y>>1);
//		int x = -1; 
//		System.out.println(x>>>29); 
//		System.out.println(x>>>30); 
//		System.out.println(x>>>31);
		 Double object = new Double("2.4");
	        int a = object.intValue();
	        System.out.println(a);
	        byte b = object.byteValue();
	        System.out.println(b);
	        float d = object.floatValue();
	        System.out.println(d);
	        double c = object.doubleValue();
	        System.out.println(c);
	 
	        System.out.println(a + b + c + d );
	} 
}

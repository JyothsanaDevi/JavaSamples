package com.java.examples.quiz;

import java.util.Scanner;

public class ArrayStack {
	
	public static class Node{
	    private	String data;
	    private Node next;
		private Node(String data){
			this.data = data;
		}
	}
	
	private Node top;

	public  boolean isEmpty(){
		return top == null;
		
	}
	
	public  void push(String data){
		Node node = new Node(data);
		top=node;
		top.next=top;
		
	}
	
	public  String pop(){
		String data= top.data;
		top = top.next;
		return data;
		
	}
	
	public static void main(String[] args) {
          ArrayStack stack = new ArrayStack();
          stack.push("Apple");
          Scanner scan = new Scanner(System.in);
          String line = scan.nextLine();
          String[] word = line.split("\\s+");
          for(String s:word){
        	  stack.push(s);
          }
          System.out.println(stack.pop());
          System.out.println(stack.isEmpty());
	}


}

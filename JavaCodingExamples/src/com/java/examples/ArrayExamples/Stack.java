package com.java.examples.ArrayExamples;

public class Stack {
	public static class Node{
	    private	int data;
	    private Node next;
		private Node(int data){
			this.data = data;
		}
	}
	
	private Node top;

	public  boolean isEmpty(){
		return top == null;
		
	}
	
	public  void push(int data){
		Node node = new Node(data);
		top=node;
		top.next=top;
		
	}
	
	public  int pop(){
		int data= top.data;
		top = top.next;
		return data;
		
	}
	
	public static void main(String[] args) {
          Stack stack = new Stack();
          System.out.println(stack.isEmpty());
          stack.push(4);
          System.out.println(stack.pop()); 
          
	}

}

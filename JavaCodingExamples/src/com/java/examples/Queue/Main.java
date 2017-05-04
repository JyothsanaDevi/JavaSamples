package com.java.examples.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueExample queue = new QueueExample();
		queue.enque(3);
		queue.enque(4);
		queue.enque(5);
		queue.enque(6);
		
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		
		

	}
	

}

package com.java.examples.Queue;

public class QueueExample {

private	int[] queue;
private int front;
private int rear;
private int size;
private int total;

public QueueExample(){
	size=10;
	front=0;
	rear=0;
	total=0;
	queue=new int[size];
}

public QueueExample(int[] queue, int front, int rear, int size, int total) {
	super();
	this.queue = queue;
	this.front = front;
	this.rear = rear;
	this.size = size;
	this.total = total;
}

public boolean isFull(){
	if(size==total){
		return true;
	}
	else{
		return false;
	}
}

public boolean enque(int item){
	if(isFull()){
		return false;
	}
	else{
	total++;
	queue[rear]=item;
	rear++;
	return true;
	}

}

public int deque(){
	int item = queue[front];
	total--;
	front++;
	return item;

}
	
}

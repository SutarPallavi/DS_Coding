package com.ds.queue;

class Queue{
	int front, rear, size;
	int capacity;
	int array[];
	
	Queue(int capacity){
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity-1;
		array = new int[this.capacity];
	}
	
	boolean isFull(Queue queue) {
		return (queue.size == queue.capacity);
	}
	
	boolean isEmpty(Queue queue) {
		return (queue.size ==0);
	}
	
	void enqueue(int item) {
		if(isFull(this)) {
			return;
		}
		
		
	}
}
public class QueueWithArrayPractice {

	
	public static void main(String[] args) {
		
	}

}

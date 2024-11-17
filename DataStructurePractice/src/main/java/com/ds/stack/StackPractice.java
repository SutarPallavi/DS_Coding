package com.ds.stack;

class Stack{
	
	private int arr[];
	private int top;
	private int capacity;
	
	Stack(int size){
		arr = new int[size];
		capacity = size;
		top =-1;
	}
	
	public boolean isFull() {
		return top == capacity-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}else {
			System.out.println("inserting n : " + data);
			arr[++top] = data;
		}
		
	}
	
	public int pop(){
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			System.exit(1);
		} 
		return arr[top--];
	}
	
	public int size() {
		return top+1;
	}
	
	public void printStack() {
		for(int i =0; i<= top; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
public class StackPractice {	
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		
		stack.push(1);
		stack.push(3);
		stack.push(4);
		
		System.out.print("Stack: " );
		stack.printStack();
		
		stack.pop();
		
		System.out.println();
		System.out.print("Stack: " );
		stack.printStack();
		
		System.out.println();
		stack.push(4);
		stack.push(6);
		stack.push(7);
		
		System.out.print("Stack: " );
		stack.printStack();
		
		System.out.println();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		
	}

}

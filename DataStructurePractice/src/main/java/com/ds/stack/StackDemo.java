//package com.ds.stack;
//
//class Stack {
//	private int arr[]; 
//	private int top; 
//	private int capacity; 
//	
//	Stack(int size){
//		arr = new int[size]; 
//		capacity = size; 
//		top =-1; 
//	}
//	
//	public boolean isFull() {
//		return top == capacity-1; 
//	}
//	
//	public boolean isEmpty() {
//		return top ==-1;
//	}
//	
//	public void push (int n) {
//		if(isFull()) {
//			System.out.println("Stack is full");
//			return; 
//		} else {
//			System.out.println("Inserting: " + n);
//			arr[++top] = n; 
//		}
//	}
//	
//	public int pop() {
//		if(isEmpty()) {
//			System.out.println("Stack is empty");
//			System.exit(1);
//		} 
//			return arr[top--];
//	}
//	
//	public int size() {
//		return top+1; 
//	}
//	
//	public void printStack() {
//		for(int i =0; i<= top; i++) {
//			System.out.print(arr[i] + ", ");
//		}
//	}
//}
//public class StackDemo {
//
//	public static void main(String[] args) {
//		Stack stack = new Stack(5); 
//		
//		stack.push(1);
//		stack.push(3);
//		stack.push(5);
//		
//		System.out.println("Stack: ");
//		stack.printStack();
//		
//		stack.pop(); 
//		System.out.println("After poping, stack is: ");
//		stack.printStack();
//	}
//
//}

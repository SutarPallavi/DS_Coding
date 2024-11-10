//package com.ds.linkedlist;
//
//class Node {
//	int data; 
//	Node next;
//	
//	public Node (int value){
//		this.data = value;
//		next = null;
//	}
//}
//
//public class LinkedListPractice {
//	static Node head;
//	
//	public int getLength(Node node) {
//		int length =0;
//		while(head != null) {
//			length++;
//			head = head.next;
//		}
//		return length;
//	}
//	
//	public void push(int new_data) {
//		Node new_node = new Node(new_data);
//		
//		new_node.next = head; 
//		
//		head = new_node; 
//	}
//	
//	public void incertAfter(Node prev_node, int new_data) {
//		Node new_node = new Node(new_data);		
//		new_node.next = prev_node.next;
//		prev_node.next = new_node;
//		return;
//	}
//	
//	public void append(int new_data) {
//		Node new_node = new Node(new_data);
//		
//		if(head == null) {
//			head = new_node;
//			return;
//		}
//		
//		new_node.next = null;
//		Node last = head;
//		
//		while(last.next !=null) {
//			last = last.next;
//		}
//		
//		last.next = new_node;		
//	}
//	
//	public void addBefore(Node next_node, int new_data) {
//		if(head == next_node) {
//			Node new_node = new Node(new_data);
//			new_node.next = head;
//			head = new_node;
//		} else {
//			Node prev_node = null;			
//			for(Node node = head; node !=next_node; prev_node = node, node = node.next);
//			
//			Node new_node = new Node(new_data);
//			new_node.next = prev_node.next;
//			prev_node.next = new_node;
//		}
//	}
//	
//	public Node reverse(Node node) {
//		Node prev = null; 
//		Node current = node;
//		Node next = null;
//		while(current!= null) {
//			next = current.next;
//			current.next = prev;
//			prev = current;
//			current = next;
//		}
//		
//		node = prev;
//		return node;
//	}
//	public int maxValue(Node head) {
//		int max = Integer.MIN_VALUE;
//		 while(head != null) {
//			 if(max<head.data) {
//				 max = head.data;
//			 }
//			 head = head.next;
//		 }
//		 
//		 return max;
//	}
//	
//	public int minValue(Node head) {
//		int min = Integer.MAX_VALUE;
//		
//		while(head != null) {
//			if(min> head.data) {
//				min = head.data;
//			}
//			head = head.next;
//		}
//		return min;
//	}
//	
//	public void printLinkedList() {
//		Node tnode = head;
//		
//		while(tnode!= null) {
//			System.out.print(tnode.data + ", ");
//			tnode= tnode.next;
//		}
//	}
//	
//	public int getMiddleElement(Node head) {
//		int length = getLength(head);
//		int mid_index = length/2;
//		while(mid_index>0) {
//			head= head.next;
//			mid_index++;
//		}
//		return head.data;
//	}
//	
//	public static void main(String[] args) {
//
//		LinkedListPractice list = new LinkedListPractice();
//		list.push(1);
//		list.push(3);
//		list.push(5);
//		list.push(6);		
//		list.printLinkedList();		
//		System.out.println();
//		list.incertAfter(head.next.next, 2);
//		list.printLinkedList();		
//		System.out.println();
//		
//		list.append(0);
//		list.printLinkedList();		
//		System.out.println();
//		
//		list.addBefore(head.next.next, 4);
//		list.printLinkedList();		
//		System.out.println();
//		
//		System.out.println("Max value : " + list.maxValue(head));
//		
//		System.out.println("Min value : " + list.minValue(head));
//		list.printLinkedList();	
//		System.out.println();
//		head = list.reverse(head);
//		while(head!=null) {
//			System.out.print(head.data + ", ");
//			head = head.next;
//		}
//		
//	}
//
//}

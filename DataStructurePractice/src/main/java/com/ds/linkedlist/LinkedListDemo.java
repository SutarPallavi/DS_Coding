//package com.ds.linkedlist;
//
//class Node {
//	int data;
//	Node next;
//	Node previous;
//
//	public Node(int value) {
//		data = value;
//		next = null;
//	}
//}
//
//class LinkedListMethods {
//	static Node head;
//	static int min = Integer.MAX_VALUE;
//	static int max = Integer.MIN_VALUE; 
//
//	public void push(int new_data) {
//		Node new_node = new Node(new_data);
//		new_node.next = head;
//		head = new_node;
//		 if(min > head.data) {
//			 min = head.data; 
//		 }
//		 if(max < head.data) {
//			 max = head.data; 
//		 }
//		
//	}
//
//	public void insertAfter(Node pre_node, int new_data) {
//		Node new_node = new Node(new_data);
//		new_node.next = pre_node.next;
//		pre_node.next = new_node;
//		return;
//	}
//
//	public void append(int new_data) {
//		Node new_node = new Node(new_data);
//		
//		if (head == null) {
//			head = new Node(new_data);
//			return;
//		}
//
//		new_node.next = null;
//		Node last = head;
//		while (last.next != null) {
//			last = last.next;
//		}
//
//		last.next = new_node;
//	}
//
//	public void addBefore(Node next_node, int value) {
//		if (head == next_node) {
//			Node new_node = new Node(value);
//			new_node.next = head;
//			head = new_node;
//		} else {
//			Node pre_node = null;
//			for (Node node = head; node != next_node; pre_node = node, node = node.next)
//				;
//			Node new_node1 = new Node(value);
//			new_node1.next = pre_node.next;
//			pre_node.next = new_node1;
//
//		}
//	}
//
//	public int maxValue(Node head) {
//		int max = Integer.MIN_VALUE;
//
//		while (head != null) {
//			if (max < head.data) {
//				max = head.data;
//			}
//			head = head.next;
//		}
//		return max;
//	}
//
//	public int minValue(Node head) {
//		int min = Integer.MAX_VALUE;
//
//		while (head != null) {
//			if (min > head.data)
//				min = head.data;
//			head = head.next;
//		}
//		return min;
//	}
//
//	public void printList() {
//		Node tnode = head;
//		while (tnode != null) {
//			System.out.print(tnode.data + ",");
//			tnode = tnode.next;
//		}
//	}
//}
//
//public class LinkedListDemo {
//	public static void main(String[] args) {
//		LinkedListMethods linkedList = new LinkedListMethods();
//		linkedList.push(5);
//		linkedList.push(4);
//		linkedList.push(9);
//		linkedList.push(7);
//		System.out.println("created Linked list");
//		linkedList.printList();
//		System.out.println();
//
//		
//		  linkedList.append(10); linkedList.printList(); 
//		  System.out.println();
//		  
//		  linkedList.insertAfter(linkedList.head.next.next.next, 11);
//		 System.out.println("After insertion"); 
//		  linkedList.printList();
//		  System.out.println();
//		  
//		 linkedList.addBefore(linkedList.head.next.next, 15);
//		 System.out.println("After insertion"); 
//		  linkedList.printList();
//		 System.out.println();
//
////		int max = linkedList.maxValue(linkedList.head);
////		System.out.println("max value from list: " + max);
////		System.out.println();
////
////		int min = linkedList.minValue(linkedList.head);
////		System.out.println("max value from list: " + min);
////		System.out.println();
//		 System.out.println(linkedList.max);
//		 System.out.println(linkedList.min);
//		 
//
//	}
//}

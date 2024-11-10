package com.ds.linkedlist;

class Node{
	int data;
	Node next; 
	
	Node(int x){
		this.data = x;
		this.next = null;
	}
}
public class FindMiddleIndex {

	static int getLength(Node head) {
		int length =0;
		while(head != null) {
			length++;
			head= head.next;
		}
		
		return length;
	}
	static int getMiddleIndex(Node node) {
		int length = getLength(node);
		int mid_length = length/2;
		
		while(mid_length>0) {
			node = node.next;
			mid_length--;
		}
		
		return node.data;
	}
	
	public static void main(String[] args) {

		Node head = new Node(2);
		head.next = new Node(4);
		head.next.next = new Node(3);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(6);
		
		System.out.println(getMiddleIndex(head));
	}

}

package com.ds.linkedlist;

class Node1{
	int data;
	Node1 next;
	
	Node1(int data){
		this.data = data;
		this.next = null;
	}
}
public class LinkedList1 {

	static Node1 head;
	public void push(int new_data) {
		Node1 new_node = new Node1(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void append(int new_data) {
		Node1 new_node = new Node1(new_data);
		if(head == null) {
			head = new_node;
			return;
		}
		Node1 last = head;
		while(last.next !=null) {
			last = last.next;
		}
		last.next = new_node;
	}
	
	public void insertAfter(Node1 pre_node, int new_data) {
		Node1 new_node = new Node1(new_data);
		new_node.next = pre_node.next;
		pre_node.next = new_node;
	}
	
	public void addBefore(Node1 next_node, int new_data) {
		Node1 new_node = new Node1(new_data);
		if(head == next_node) {
			new_node.next = head;
			head = new_node;		
		}
		else {
			Node1 pre_node = null;
			for(Node1 node= head; node!= next_node; 
					pre_node = node, node =node.next);
			new_node.next = pre_node.next;
			pre_node.next = new_node;
		}
	}
	
	public void removeElement(int data) {
		Node1 node = new Node1(data);
		Node1 existing_node = head;
		Node1 pre_node = null;
		if(existing_node.data == node.data) {
			Node1 new_head = existing_node.next;
			head = new_head;
		}
		else {
			while(existing_node != null) {
				if(existing_node.data == node.data) {
					break;
				}
				else
					pre_node = existing_node;
					existing_node = existing_node.next;
			}
			existing_node = pre_node;
			existing_node.next = null;
		}
	}
	
	public Node1 findMiddleElement(Node1 head1) {
		Node1 node = head1;
		int length = getlength();
		System.out.println(length);
		int mid_length = length/2;
		while(mid_length>0) {
			node = node.next;
			mid_length--;
		}
		return node;
	}
	
	public int getlength() {
		Node1 node = head;
		int length =0;
		while(node!= null) {
			length++;
			node = node.next;
		}
		return length;
	}
	public Node1 reverse() {
		Node1 pre = null, next;
		while(head != null) {
			next = head.next;
			head.next=pre;
			pre = head;
			head = next;
		}
		return pre;
	}
	public void printList() {
		Node1 node = head;
		while(node != null) {
			System.out.print(node.data + ", ");
			node = node.next;
		}
	}
	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.push(1);
		list.printList();
		System.out.println();
		list.push(2);
		list.printList();
		System.out.println();
		list.append(4);
		list.printList();
		System.out.println();
		list.addBefore(head, 3);
		list.printList();
		System.out.println();
		list.removeElement(4);
		list.printList();
		System.out.println();
		list.push(4);
		list.printList();
		System.out.println();
		list.push(5);
		list.printList();
		System.out.println();
		Node1 node = list.findMiddleElement(head);
		System.out.println("Mid element: "+node.data);
		
		head =list.reverse();
		while(head!=null) {
			System.out.print(head.data + ", ");
			head = head.next;
		}
	}

}

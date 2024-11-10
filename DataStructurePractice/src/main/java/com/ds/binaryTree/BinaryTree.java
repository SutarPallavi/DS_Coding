package com.ds.binaryTree;

class Node {
	int key; 
	Node left, right; 
	
	Node(int item){
		key = item; 
		left = right = null; 
	}
}

public class BinaryTree {

	Node root; 
	 public BinaryTree(int key) {
		 root = new Node(key); 
	}
	 
	 public BinaryTree() {
		root =null; 
	}
	 
	// Given a binary tree, print its nodes in inorder
	 void printInorder(Node node) {
		 if (node ==null)
			 return; 
		 printInorder(node.left); 
		 System.out.print(node.key + "->");
		 printInorder(node.right);
	 }
	 
	 //preoder traversal
	 void printPreorder(Node node) {
		 if(node == null)
			 return; 
		 System.out.print(node.key + "->");
		 printPreorder(node.left);
		 printPreorder(node.right);
	 }
	 
	 //postorder traversal
	 void printPostorder(Node node) {
		 if(node == null)
			 return; 
		 printPostorder(node.left);
		 printPostorder(node.right);
		 System.out.print(node.key + "->");
	 }
	 
	 //level traversal
	 
	 void printLevelOrder() {
		 int h = height(root); 
		 int i; 
		 for(i=1; i<=h; i++)
			 printCurrentLevel(root, i); 
	 }
	 
	 
	 private void printCurrentLevel(Node root, int level) {
		if(root == null)
			return; 
		if(level ==1)
			System.out.print(root.key + " ");
		else if(level > 1) {
			printCurrentLevel(root.left, level-1);
			printCurrentLevel(root.right, level-1);
		}
	}

	int height(Node root) {
		if(root == null)
			return 0;
		int lheight = height(root.left);
		int rheight = height(root.right); 
		 
		if(lheight>rheight)
			return lheight+1;
		else
			return rheight + 1; 
	}

	public static void main(String [] args) {
		 BinaryTree tree = new BinaryTree();
		 
		 //create root
		 tree.root = new Node(1);
			/* 
			 * 	1 
			 * / \
			 * 
			 */
		 
		 tree.root.left = new Node(2); 
		 tree.root.right = new Node(3); 
		 
			/*
			 *    1 
			 * 	/ 	\ 
			 *  2 	3
			 */
		 
		 tree.root.left.left = new Node(4); 
		 tree.root.left.right = new Node(5); 
		 
//		 		1
//		 	   /  \
//		 	  2    3
//		 	 / \
//		 	4   5
		 
		 tree.root.right.left = new Node(6); 
		 tree.root.right.right = new Node(7);
		 
//		 		1
//		 	   / \
//		 	  2    3
//		 	 / \  / \
//		 	4   5 6  7
		 System.out.println("Inorder traversal of binary tree is ");
		 tree.printInorder(tree.root);
		 
		 System.out.println();
		 
		 System.out.println("Preorder traversal of binary tree is ");
		 tree.printPreorder(tree.root);
		 
		 System.out.println();
		 
		 System.out.println("Postorder traversal of binary tree is ");
		 tree.printPostorder(tree.root);
		 
		 System.out.println();
		 
		 System.out.println("Levelorder traversal of binary tree is ");
		 tree.printLevelOrder();
	 }
}

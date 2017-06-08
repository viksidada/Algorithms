package com.CodingPracticeQuestions;

public class BST1 {
	
	Node root;
	
	public BST1() {
		root = null;
	}
	
	public void add(int value) {
		root = add(root, value);
	}
	
	private Node add(Node root, int value) {
		
		if (root == null) {
			root = new Node(value);
		} else if (value < root.data) {
			root.left = add(root.left, value);
		}else if (value > root.data) {
			root.right = add(root.right, value);
		}
		
		return root;
	}
	
	public boolean contains(int value) {
		return contains(root, value);
	}
	
	private boolean contains(Node root, int value) {
		boolean found = false;
		if (root ==null) {
			return false;
		} else if (root.data == value) {
			found = true;
		} else if (value < root.data) {
			found = contains(root.left, value);
		} else if (value > root.data) {
			found = contains(root.right, value);
		}
		
		return found;
	}
	
	public void preOrderTraversal(Node root) {
		
		if (root == null) {
			return;
		}
		
		System.out.print(root.getData() + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

}

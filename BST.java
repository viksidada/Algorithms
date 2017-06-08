package com.Practice;

public class BST {
	
	Node root;
	
	public BST() {
		root = null;
	}
	
	public void add(int value) {
		root = add(root, value);
	}
	
	private Node add(Node root, int value) {
		if (root == null) {
			root = new Node(value);
		} else if (value < root.getData()) {
			root.left = add(root.left, value);
		} else if (value > root.getData()) {
			root.right = add(root.right, value);
		}
		
		return root;
	}
	
	public boolean search(int value) {
		return search(root, value);
	}
	
	private boolean search(Node root, int value) {
		boolean found = false;
		if (root == null) {
			found = false;
		} else if (root.getData() == value) {
			found = true;
		} else if (value < root.getData()) {
			if (root.left == null) {
				found = false;
			} else found = search(root.left, value);
		} else if (value > root.getData()) {
			if (root.right == null) {
				found = false;
			} else found = search(root.right, value);
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

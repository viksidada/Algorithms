package com.CodingPracticeQuestions.TreeImplementation;

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
		} else if (root.getData() > value) {
			root.left = add(root.left, value);
		} else if (root.getData() < value) {
			root.right = add(root.right, value);
		}

		return root;
	}

	public boolean search(int value) {
		return search(root, value);
	}

	private boolean search(Node node, int value) {
		boolean found = false;

		while ((node != null) && (!found)) {
			if (node.getData() > value) {
				node = node.left;
			} else if (node.getData() < value) {
				node = node.right;
			} else {
				found = true;
				break;
			}

			found = search(node, value);
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
	
	public void postOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		preOrderTraversal(root.left);
		System.out.print(root.getData() + " ");
		
		preOrderTraversal(root.right);
	}
	
	public void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		System.out.print(root.getData() + " ");
	}

}

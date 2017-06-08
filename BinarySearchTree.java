package com.Practice;

public class BinarySearchTree {

	public static void main(String[] args) {
		
		BST bst = new BST();
		
		bst.add(2);
		bst.add(4);
		bst.add(1);
		bst.add(10);
		
		System.out.println(bst.search(108));
		
		System.out.println();
		bst.preOrderTraversal(bst.root);
		

	}

}

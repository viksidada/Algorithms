package com.CodingPracticeQuestions;

public class BinarySearchTree1 {
	public static void main(String[] args) {
		BST1 bst = new BST1();
		
		bst.add(2);
		bst.add(9);
		bst.add(3);
		bst.add(5);
		bst.add(4);
		
		System.out.println(bst.contains(2));
		System.out.println();
		System.out.println(bst.contains(25));
		System.out.println();
		
		bst.preOrderTraversal(bst.root);
	}

}

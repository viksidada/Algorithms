package com.CodingPracticeQuestions;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
	
		BST bst = new BST();
		
		bst.add(2);
		bst.add(4);
		bst.add(76);
		bst.add(-4);
		bst.add(83);
		bst.add(2);
		
		
		System.out.println(bst.contains(4));
		System.out.println();
		System.out.println(bst.contains(45));
		System.out.println();
		
		bst.preOrderTraversal(bst.root);

	}

}

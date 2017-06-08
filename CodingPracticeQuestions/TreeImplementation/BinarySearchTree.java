package com.CodingPracticeQuestions.TreeImplementation;

public class BinarySearchTree {

	public static void main(String[] args) {
		BST bst = new BST();

		bst.add(5);
		bst.add(10);
		bst.add(3);
		bst.add(8);
		bst.add(10);
		bst.add(18);
		bst.add(-6);

		System.out.println(bst.search(19));
		System.out.println();
		bst.preOrderTraversal(bst.root);
		System.out.println();
		bst.postOrderTraversal(bst.root);
		System.out.println();
		bst.inOrderTraversal(bst.root);

	}

}

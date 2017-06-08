package com.CodingPracticeQuestions;

public class Node {
	
	Node left;
	Node right;
	int data;
	
	public Node(int data) {
		super();
		this.data = data;
		left = null;
		right = null;
	}
	
	public Node() {
		left = null;
		right = null;
		data = 0;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
	

}

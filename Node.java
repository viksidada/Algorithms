package com.Practice;

public class Node {
	
	Node left;
	Node right;
	int data;
	
	public Node(int data) {
		super();
		left = null;
		right = null;
		this.data = data;
	}
	
	public Node() {
		left = right = null;
		data = 0;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
	

}

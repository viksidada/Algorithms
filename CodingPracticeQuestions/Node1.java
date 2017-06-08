package com.CodingPracticeQuestions;

public class Node1 {
	
	Node1 left;
	Node1 right;
	int data;
	
	public Node1(int data) {
		super();
		left = null;
		right = null;
		this.data = data;
	}
	
	public Node1() {
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

	@Override
	public String toString() {
		return "Node1 [data= " + data + "]";
	}
	
	
	
	

}

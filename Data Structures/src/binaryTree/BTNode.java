package binaryTree;

public class BTNode {
	int data ;
	BTNode left , right , father;
	
	public BTNode() {
		data =0;
		left = null;
		right = null;
		father = null;
	}
	
	public BTNode(int data) {
		this.data = data;
		left = null;
		right = null;
		father = null;
	}
	
}

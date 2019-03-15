package LinkedList2;

public class Node {
	public int data;
	public Node prev;
	public Node next;
	
	public Node() {
		data=0;
		next=null;
		prev=null;
		
	}
	
	public Node(int data, Node prev, Node next) {
		this.data=data;
		this.next= next;
		this.prev=prev;
	}
	
	public Node(Node other) {
		this.data=other.data;
		this.next=other.next;
		this.prev=other.prev;
	}
	

}

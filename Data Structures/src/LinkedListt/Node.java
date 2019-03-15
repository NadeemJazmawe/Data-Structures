package LinkedListt;

public class Node {
	
	public int data;
	public Node next;

	public Node() {
		data = 0;
		next = null;
	}
	
	public Node(int data , Node next) {
		this.data = data;
		this.next = next;
	}
	
	public Node(Node other) {
		this.data = other.data;
		this.next = other.next;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public String toString() {
		return "" + data;
	}

	public static void main(String[] args) {
		Node n = new Node();
		System.out.println(n.toString());
		n.setData(5);
		System.out.println(n.toString());
		Node m = new Node( 7 , n);
		System.out.println(m.toString());
		Node x = new Node(m);
		System.out.println(x.toString());
		System.out.println(x.getNext().toString());
	}

}

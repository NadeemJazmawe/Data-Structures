package BidirectionalLinkedList;


public class LinkedList {
	Node head;
	Node tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public LinkedList(Node head) {
		this.head = new Node(head);
		this.tail = head;
	}

	public LinkedList(LinkedList other) {
		this.head = new Node(other.head);
		this.tail = new Node(other.tail);
	}

	public void add(int d) {
		tail.next = new Node(d , tail ,null);
		tail=tail.next;
	}

	public int size() {
		if(head == null)
			return 0;
		else if(head == tail)
			return 1;
		else {
			int count = 1;
			Node help = head;
			while(help.next != null) {
				help = help.next;
				count++;
			}
			return count;
		}
	}

	public boolean contains(int m) {
		if(head.data == m)
			return true;
		else {
			Node help = head;
			while(help.next != null) {
				help = help.next;
				if(help.data == m)
					return true;
			}
		}
		return false;
	}

	public void remove(int m) {
		if(head == null)
			return;
		if(head.data == m)
			head = head.next;
		if(head.next.data == m)
			head.next = head.next.next;
		else {
			Node help = head;
			while(help.next.next != null) {
				help  = help.next;
				if(help.next.data == m)
					help.next = help.next.next;
			}
		}

	}

}

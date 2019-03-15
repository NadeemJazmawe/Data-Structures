package LinkedListt;

import LinkedListt.Node;

public class LinkedList {
	public Node head;
	int size;

	public LinkedList() {
		head = null;
		size =0;
	}

	public LinkedList(Node head) {
		this.head = new Node(head);
		size = 1;
	}

	public LinkedList(LinkedList other) {
		this.head = new Node(other.head);
		this.size = other.size;
	}

	public void add(Node val) {
		if(head == null)
			head = new Node(val);
		else {
			Node help = head;
			while(help.next != null) {
				help = help.next;
			}
			help.next = new Node(val);
		}
	}

	public void add(int d) {
		if(head == null)
			head = new Node(d , null);
		else {
			Node help = head;
			while(help.next != null) {
				help = help.next;
			}
			help.next = new Node(d , null);
		}
	}
	
	public int getSize() {
		if(head ==null)
			return 0;
		else {
			int count = 1 ;
			Node help = head;
			while(help.next != null) {
				help = help.next ;
				count++;
			}
			return count;
		}
	}
	
	public boolean contains(int m) {
		if(head.data == m)
			return true;
		Node help = head;
		while(help.next != null) {
			help = help.next;
			if(help.data == m)
				return true;
		}
		return false;
	}
	
	public String toString() {
		String ans ="(";
		ans += head.data;
		Node help = head;
		while(help.next != null) {
			help = help.next;
			ans = ans + " , " + help.data;
		}
		ans += ")";
		return ans;
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
			help  = help.next;
			if(help.next.data == m)
				help.next =  null;
		}
	}
	public void remove2(int m) {
		if(head == null)
			return;
		if(head.data == m)
			head = head.next;
		else {
			Node help1 = head;
			Node help2 = head;
			while(help1 != null) {
				help1 = help1.next;
				if(help1.data == m) {
					help2.next = help1.next;
					break;
				}
				else
					help2 = help2.next;
			}
		}
	}




	public static void main(String[] args) {
		
	}

}

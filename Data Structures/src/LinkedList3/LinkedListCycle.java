package LinkedList3;

import java.awt.List;

public class LinkedListCycle {

	private NodeCycle head;
	private int size;

	public LinkedListCycle() {
		head=null;
		size=0;
	}

	public void add(String obj) {
		if (head==null) {
			head=new NodeCycle(obj, null);
			head.next=head;
		}
		else {
			NodeCycle n= new NodeCycle(obj,head);
			NodeCycle t= head;
			while(t.next != head) {
				t=t.next;
			}
			t.next=n;
			size++;		
		}
	}

	public void remove(String obj) {
		if(head== null) {
			return;
		}
		else if(head.data== obj) {
			if(head.next==head) { //size=1
				head=null;
				size=0;		
			}
			else {
				NodeCycle t= head;
				while (t.next != head) {
					t=t.next;
				}
				t.next=head.next;
				head.next=null;
				head=t.next;
				size--;
			}
		}

		else {
			NodeCycle t=head;
			while(t.next.data != obj) {
				t=t.next;
				if(t == head)
					return;
			}
			t.next=t.next.next;
			size--;
		}
	}


	public boolean contains(Object obj) {
		boolean ans= false;
		if(head != null) {
			if(head.data==obj)
				ans=true;
			else { // head.data!= obj
				NodeCycle n=head;
				while(n.next!=head) {
					n=n.next;
					if(n.data== obj)
						return true;
				}
				return ans;
			}
		}
		return ans;
	}

	public String toString() {
		String s= "[";
		if(head!= null) {
			s=s + head.toString() + ", ";
			for(NodeCycle n= head.next; n!= head; n=n.next) {
				s=s+n.toString() + ", ";
				}
				s=s.substring(0, s.length()-2);
			}
		return s + "]";
	}
	
	
	public static void main(String[] args) {
		LinkedListCycle list= new LinkedListCycle();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
	}




}


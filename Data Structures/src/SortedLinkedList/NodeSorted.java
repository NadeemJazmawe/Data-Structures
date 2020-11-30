package SortedLinkedList;

public class NodeSorted {
	String data;
	NodeSorted next;
	
	public NodeSorted(String data, NodeSorted next) {
		this.data=data;
		this.next=next;
	}
	
	public String toString() {
		return this.data;
	}

}

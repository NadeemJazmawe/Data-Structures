package CycleLinkedList;

public class NodeCycle {
	
	String data;
	NodeCycle next;
	
	public NodeCycle(String data, NodeCycle next ) {
		this.data=data;
		this.next=next;
	}
	
	public String toString() {
		return "" + this.data;
	}
	

}

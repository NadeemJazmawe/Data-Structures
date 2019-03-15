package LinkedList4;

public class LinkedListSorted {
	NodeSorted head;
	int size;

	public LinkedListSorted() {
		head=null;
		size=0;
	}

	public void add(String str) {
		if(head==null) {
			head= new NodeSorted(str,null);
			head.next = head;
			size=1;
		}
		else {
			if(head.data.compareTo(str)>0) {
				NodeSorted m = new NodeSorted(str,head);
				NodeSorted helper = head;
				while(helper.next != head)
					helper = helper.next;
				helper.next = m;
				head = m;
			}
			else {
				NodeSorted t=head;
				while(t.next!=head) {
					if(t.next.data.compareTo(str)>0)
						break;
					t=t.next;
				}
				NodeSorted m = new NodeSorted(str,t.next);
				t.next=m;
			}
			size++;
		}
	}

	public boolean contains(String str){
		boolean ans= true;
		NodeSorted t=head;
		while(t!=null && !t.data.equals(str) && t.data.compareTo(str)<0 ) {
			t=t.next;
		}
		if(t==null || t.data.compareTo(str)>0) {
			ans=false;
		}
		return ans;
	}

	public boolean remove(String str) {
		if (head==null) {
			return false;
		}
		else if (!this.contains(str))
			return false;
		else if(head.data==str) {
			if(head.next == head) {
				head = null;
				size = 0;
				return true;
			}
			else {
				NodeSorted t= head;
				while(t.next != head) {
					t=t.next;
				}
				t=head.next;
				head=head.next;
				size--;
				return true;
			}
		}
		else {
			NodeSorted t=head;
			while(t.next.data != str)
				t=t.next;
			t.next=t.next.next;
			return true;
		}
	}
	
	public String toString(String str) {
		String ans= "]";
		if(head != null) {
			ans= ans + head.toString()+ ",";
			for(NodeSorted n=head.next; n!= null; n=n.next) {
				ans=ans+n.toString() + ", ";
			}
			ans=ans.substring(0, ans.length()-2);
		}
			
		return ans + "]";
	}
	
	public static void main(String[] args) {
		
	}

}

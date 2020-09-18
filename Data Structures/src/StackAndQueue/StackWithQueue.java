package StackAndQueue;

public class StackWithQueue {
	MyQueue queue ;

	public StackWithQueue() {
		queue = new MyQueue();
	}

	public StackWithQueue(int size) {
		queue = new MyQueue(size);
	}

	public boolean push(int newValue){
		return queue.enQueue(newValue);
	}

	public int pop() {
		if(queue.isEmpty())
			return Integer.MAX_VALUE;
		MyQueue help = new MyQueue(queue.Size());
		while(queue.Size() > 1)
			help.enQueue(queue.dequeue());
		int data = queue.dequeue();
		while(!help.isEmpty())
			queue.enQueue(help.dequeue());
		
		return data;
	}

	public int peek() {
		if(queue.isEmpty())
			return Integer.MAX_VALUE;
		MyQueue help = new MyQueue(queue.Size());
		while(queue.Size() > 1)
			help.enQueue(queue.dequeue());
		int data = queue.dequeue();
		while(!help.isEmpty())
			queue.enQueue(help.dequeue());
		queue.enQueue(data);
		
		return data;
	}

	public void clear() {
		queue = new MyQueue();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int size() {
		return queue.Size();
	}

	public String toString() {
		if(this.isEmpty())
			return "( )";
		MyQueue help = new MyQueue(queue.Size());
		while(!queue.isEmpty())
			help.enQueue(queue.dequeue());
		String s= "";
		while(!help.isEmpty()) {
			int data = help.dequeue();
			s = data + ", " + s;
			queue.enQueue(data);
		}
		return "(" + s.substring(0 , s.length()-2) + ")";
	}

}

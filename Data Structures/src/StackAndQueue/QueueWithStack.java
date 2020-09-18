package StackAndQueue;

public class QueueWithStack {
	MyStack stack ;

	public QueueWithStack() {
		stack = new MyStack();
	}

	public QueueWithStack(int maxSize) {
		stack = new MyStack(maxSize);
	}

	public int Size() {
		return stack.size();
	}

	public boolean enQueue(int data) {
		return stack.push(data);
	}

	public boolean isEmpty() {
		if(stack.size() == 0)
			return true;
		return false;
	}

	public int dequeue() {
		if(stack.size() == 0)
			return Integer.MAX_VALUE;
		else {
			MyStack help = new MyStack(stack.size());
			while(!stack.isEmpty())
				help.push(stack.pop());
			int data = help.pop();
			while(!help.isEmpty())
				stack.push(help.pop());
			return data;
		}
	}

	public String toString() {
		if(this.isEmpty())
			return "( )";

		MyStack help = new MyStack(stack.size());
		while(!stack.isEmpty())
			help.push(stack.pop());
		String s= "(";
		while(!help.isEmpty()) {
			int data = help.pop();
			s += data + ", ";
			stack.push(data);
		}
		return s.substring(0 , s.length()-2) + ")";
	}
}

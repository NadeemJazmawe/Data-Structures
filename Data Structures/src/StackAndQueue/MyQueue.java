package StackAndQueue;

public class MyQueue {
	private int front, tail,size;
	private final int INIT_size = 5;
	private int maxSize;
	private int [] queue;
	
	public MyQueue() {
		front=0;
		tail=0;
		size=0;
		maxSize=INIT_size;
		queue= new int[INIT_size];
	}
	
	public MyQueue(int maxSize) {
		front=0;
		tail=0;
		size=0;
		this.maxSize=maxSize;
		queue= new int[maxSize];
	}
	
	public int Size() {
		return size;
	}
	
	public boolean enQueue(int data) {
		if(size== maxSize)
			return false;
		else {
			queue[tail]=data;
			size++;
			tail= (tail+1)% maxSize;
			return true;
		}
	}
	
	public boolean isEmpty() {
		if(size==0)
			return true;
		return false;
	}
	
	public int dequeue() {
		if(size==0)
			return Integer.MAX_VALUE;
		else {
			int data= queue[front];
			size--;
			front=(front+1)% maxSize;
			return data;
		}
	}
	
	public String toString() {
		if(this.isEmpty())
			return "( )";
		String s= "(";
		int help = front;
		for (int i = 0; i < size; i++) {
			s += queue[help] + ", ";
			help = (help+1)%maxSize;
		}
		
		return s.substring(0 , s.length()-2) + ")";
	}
	

}











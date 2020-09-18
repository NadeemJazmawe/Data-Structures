package StackAndQueue;

public class MyStack {

	int max_size = 5;
	int stack[];
	int top;
	
	public MyStack() {
		stack = new int[max_size];
		top = 0;
		}
	public MyStack(int size) {
		max_size = size;
		stack = new int[max_size];
		top = 0;
		}

	public boolean push(int newValue){
		if(top==stack.length)
			return false;
	
		stack[top]= newValue;
		top++;
		return true;	
	}
	
	public int pop() {
		int result= Integer.MAX_VALUE;
		if (top>0)
			result= stack[--top];
		return result;	
	}
	
	public int peek() {
		int result= Integer.MAX_VALUE;
		if (top>0) 
			result= stack[top-1];
		return result;	
	}
	
	public void clear() {
		top=0;
	}
	
	public boolean isEmpty() {
		return (top==0);
	}
	
	public int size() {
		return top;
	}
	
	public int elementAt(int index) {
		if(index<0 || index>=top)
			return -1;
		return stack[index];			
	}
	
	public String toString() {
		if(this.isEmpty())
			return "( )";
		String result= "(";
		for (int i = top-1 ; i >= 0 ; i--) {
			result= result + stack[i]+ ", ";
		}
		return result.substring(0 , result.length()-2) + ")";
	}


}


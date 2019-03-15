package MyStack;

public class MyStack {

	int max_size = 5;
	int stack[];
	int top;
	
	public MyStack() {
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
		String result= "";
		for (int i = 0; i <top; i++) {
			result= result + stack[i]+ ",";
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		MyStack t= new MyStack();
		System.out.println(t.isEmpty());
		System.out.println(t.push(3));
		System.out.println(t.push(6));
		System.out.println(t.push(3));
		System.out.println(t.push(3));
		System.out.println(t.push(2));
		System.out.println(t.pop());
		System.out.println(t.push(4));
		System.out.println(t.peek());
		System.out.println(t.isEmpty());
//		t.clear();
		System.out.println(t.size());	
		System.out.println(t.elementAt(1));
		System.out.println(t.toString());
		}

}


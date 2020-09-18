package StackAndQueue;

public class Main {

	public static void main(String[] args) {
		System.out.println("testing MyStack :-");
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
		System.out.println(t.size());	
//		System.out.println(t.elementAt(1));
		System.out.println(t.toString());
		t.clear();
		System.out.println(t.isEmpty());


		
//		System.out.println();
//		System.out.println("testing MyQueue :-");
//		MyQueue t2= new MyQueue();
//		System.out.println(t2.isEmpty());
//		t2.enQueue(1);
//		t2.enQueue(2);
//		t2.enQueue(3);
//		t2.enQueue(4);
//		t2.enQueue(5);
//		t2.enQueue(6);
//		System.out.println(t2.toString());
//		System.out.println(t2.dequeue());
//		System.out.println(t2.dequeue());
//		System.out.println(t2.dequeue());
//		System.out.println(t2.dequeue());
//		System.out.println(t2.dequeue());
//		System.out.println(t2.dequeue());
//		
//		System.out.println();
//		System.out.println("testing QueueWithStack :-");
//		QueueWithStack t3= new QueueWithStack();
//		System.out.println(t3.isEmpty());
//		t3.enQueue(1);
//		t3.enQueue(2);
//		t3.enQueue(3);
//		t3.enQueue(4);
//		t3.enQueue(5);
//		t3.enQueue(6);
//		System.out.println(t3.toString());
//		System.out.println(t3.dequeue());
//		System.out.println(t3.dequeue());
//		System.out.println(t3.dequeue());
//		System.out.println(t3.dequeue());
//		System.out.println(t3.dequeue());
//		System.out.println(t3.dequeue());
		
		
		
		System.out.println();
		System.out.println("testing StackWithQueue :-");
		StackWithQueue t4= new StackWithQueue();
		System.out.println(t4.isEmpty());
		System.out.println(t4.push(3));
		System.out.println(t4.push(6));
		System.out.println(t4.push(3));
		System.out.println(t4.push(3));
		System.out.println(t4.push(2));
		System.out.println(t4.pop());
		System.out.println(t4.push(4));
		System.out.println(t4.peek());
		System.out.println(t4.isEmpty());
		System.out.println(t4.size());	
//		System.out.println(t4.elementAt(1));
		System.out.println(t4.toString());
		t4.clear();
		System.out.println(t4.isEmpty());


	}

}

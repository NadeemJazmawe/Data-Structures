package BinaryTrees;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("test BinaryTree");
		BinaryTree b = new BinaryTree();
		b.add(7);
		b.add(3);
		b.add(2);
		b.add(5);
		b.add(4);
		b.add(6);
		b.add(8);
		b.add(9);
		
		b.preOrder();
		b.inOrder();
		b.postOrder();
		
		System.out.println();
		System.out.println("test BinarySearchTree");
		BinarySearchTree b2 = new BinarySearchTree();
		b2.add(7);
		b2.add(3);
		b2.add(2);
		b2.add(5);
		b2.add(4);
		b2.add(6);
		b2.add(8);
		b2.add(9);
		
		b2.preOrder();
		b2.inOrder();
		b2.postOrder();
		
		
	}

}

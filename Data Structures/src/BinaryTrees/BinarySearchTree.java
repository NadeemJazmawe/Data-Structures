package BinaryTrees;

public class BinarySearchTree {
	BTNode root;

	public BinarySearchTree() {
		root = null;
	}

	public BinarySearchTree(BTNode root) {
		this.root = root;
	}

	public void add(int m) {
		if(root == null)
			root = new BTNode(m);
		else
			add(m , root);
	}

	private void add(int m , BTNode h) {
		if(h.data >= m ) {
			if(h.left == null)
				h.left = new BTNode(m);
			else
				add(m , h.left);
		}
		else {
			if(h.right == null)
				h.right = new BTNode(m);
			else
				add(m , h.right);
		}
	}

	public boolean isEmpty() {
		if(root == null)
			return true;
		return false;
	}

	public int hight() {
		return hight(root)-1;
	}

	private int hight(BTNode h) {		
		int lh = 0 , rh =0;
		if(h.left != null)
			lh = hight(h.left);
		if(h.right != null)
			rh = hight(h.right);
		return Math.max(lh , rh)+1;
	}

	public int numOfNode() {
		return numOfNode(root);
	}

	private int numOfNode(BTNode h) {
		if(h == null)
			return 0;
		return 1 + numOfNode(h.left) + numOfNode(h.right);
	}

	public boolean contains(int val) {
		return contains(val , root);
	}

	private boolean contains(int val , BTNode h) {
		if(h == null)
			return false;
		else if(h.data == val)
			return true;
		else if(contains(val , h.left) || contains(val , h.right))
			return true;
		return false;
	}

	public void preOrder() {
		preOrder(root);
		System.out.println();
	}
	
	private void preOrder(BTNode h) {
		if(h == null)
			return ;
		System.out.print(h.data + " ");
		preOrder(h.left);
		preOrder(h.right);
	}

	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(BTNode h) {
		if(h == null)
			return ;
		inOrder(h.left);
		System.out.print(h.data + " ");
		inOrder(h.right);
	}

	public void postOrder() {
		postOrder(root);
		System.out.println();
	}
	
	private void postOrder(BTNode h) {
		if(h == null)
			return ;
		postOrder(h.left);
		postOrder(h.right);
		System.out.print(h.data + " ");
	}

}







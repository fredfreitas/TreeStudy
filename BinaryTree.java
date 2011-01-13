public class BinaryTree {
	
	public Node root;

	public BinaryTree() { 
		root = null;
	}

	public void insert(int k, Node root) {
		if(root == null){
			root = new Node();
			root.setLeft(null);
			root.setRight(null);
			root.setKey(k);
		} else {
			if(k < root.getKey()) {
				insert(k, root.left);
			}
			if(k > root.getKey()) {
				insert(k, root.right);
			}
		}
	}

//	public remove(int k, Node root) {
}

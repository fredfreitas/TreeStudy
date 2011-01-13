public class BSTree {

	public Node root;

	public BSTree() {
		root = null;
	}	

	public void insert(int k) {
		if(root == null) {
			root = new Node(k);
			return;
		}

		Node step = root, next = null;
		do{
			if(k <= step.getKey()) {
				next = step.getLeft();
			} else {
				next = step.getRight();
			}

			if(next != null) {
				step = next;
			}
		} while(next != null);

		if(k <= step.getKey()) {
			step.setLeft(k);
		} else {
			step.setRight(k);
		}
	}

	public Node search(int k) {
		Node step;
		step = root;
		while(step != null && step.getKey() != k) {
			if(k < step.getKey()) {
				step = step.getLeft();
			} else {
				step = step.getRight();
			}
		}
		return step;
	}

}

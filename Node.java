// definição de cada Nó da BST
public class Node {

	public int key;

	public Node left, right;

	public Node() {
		key = 0;
		left = right = null;
	}

	public Node(int k) {
		key = k;
		left = right = null;
	}

	// métodos de encapsulamento - GETs e SETs

	// GET key
	public int getKey() {
		return key;
	}

	//GET Left Node
	public Node getLeft() {
		if(left != null) {
			return left;
		} else {
			return null;
		}
	}

	// GET Right Node
	public Node getRight() {
		if(right != null) {
			return right;
		} else {
			return null;
		}
	}

	// SET Left Node
	public void setLeft(int k) {
		left = new Node(k);
	}

	//SET Right Node
	public void setRight(int k) {
		right = new Node(k);
	}

	public void childRight(Node n) {
		right = n;
	}

	public void childLeft(Node n) {
		left = n;
	}
}

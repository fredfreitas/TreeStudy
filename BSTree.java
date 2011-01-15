public class BSTree {

	public Node root;

	// construtor padrão - cria a árvores só com uma root nula
	public BSTree() {
		root = null;
	}	

	// inserção - insere nós de acordo com as regras de árvore
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

	// busca - realiza uma busca pela chave parametrizada e retorna o nó que a contém ou null se não houver ocorrência
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

	// deleção por mescla
	public void deleteMerge(int k) {
		Node aux, aux2, prev, node1 = null;
		if(root == null) {
			return;
		}
		if(root.getKey() == k) {
			if(root.getLeft() == null) {
				aux = root;
				root = root.getRight();
				return;
				// aux é a única referência ao nó a ser deletado.
			}
			if(root.getRight() == null) {
				aux = root;
				root = root.getLeft();
				return;
				// aux é a única referência ao nó a ser deletado.
			}
			aux = root;
			aux2 = root.getRight();
			root = root.getLeft();
			// aux é a única referência ao nó a ser deletado.
			aux = root;
			while(aux.getRight() != null) {
				aux = aux.getRight();
			}
//			aux.childRight(aux2);
			aux.right = aux2;
			return;
		}
		// caso o nó a ser deletado não seja a raíz.
		prev = root;
		do {
			if(k < prev.getKey()) {
			node1 = prev.getLeft();
			} else {
				node1 = prev.getRight();
			}
			if(node1 == null) {
				break;
			}
			if(node1.getKey() != k) {
				prev = node1;
				// trial to make this code right
				node1 = null;
			}
		} while(node1 == null); 
//		return;

		if(node1.getLeft() == null) {
			if(prev.getKey() > node1.getKey()) {
				prev.left = node1.right;
				// prev.childLeft(node1.getRight());
				// delete node1
				// node1, sem nenhuma referência a si, será deltado pelo Garbage Collector
				return;
			} else {
			//prev.childRight(node1.getRight());
			prev.right = node1.right;
			// delete node1
			// node1, sem nenhuma referência a si, será deltado pelo Garbage Collector
			return;
			}
		}
		if(node1.getRight() == null) {
			if(prev.getKey() > node1.getKey()) {
				// prev.childLeft(node1.getLeft();
				prev.left = node1.left;
			} else {
				//prev.childRight(node1.getLeft());
				prev.right = node1.left;
			}
			// delete node1
			// node1, sem nenhuma referência a si, será deltado pelo Garbage Collector
			return;
		}
		aux = node1.getRight();
		if(prev.getKey() > node1.getKey()) {
			// prev.child(node1.getLeft());
			prev.left = node1.left;
		} else {
			// prev.childRight(node1.getLeft());
			prev.right = node1.left;
		}
		Node step = node1.getLeft();
		// delete node1
		// node1, sem nenhuma referência a si, será deltado pelo Garbage Collector
		while(step.getRight() != null) {
			step = step.getRight();
		}
		// step.childRight(aux);
		step.right = aux;
		return;
}

		// impressão em pre-order - recursivo
		//	parametro inicial, n = root.
		public void printPreOrder(Node n) {
			System.out.print(n.getKey() + " ");
			if(n.getLeft() != null) {
				printPreOrder(n.getLeft());
			}
			if(n.getRight() != null) {
				printPreOrder(n.getRight());
			}
		}

		// impressão em in-order - recursivo
		//	parametro inicial, n = root.
		public void printInOrder(Node n) {
			if(n.getLeft() != null) {
				printInOrder(n.getLeft());
			}
			System.out.print(n.getKey() + " ");		
			if(n.getRight() != null) {
				printInOrder(n.getRight());
			}
		}

		// impressão em post-order - recursivo
		//	parametro inicial, n = root.
		public void printPostOrder(Node n) {
		
			if(n.getLeft() != null) {
				printPostOrder(n.getLeft());
			}
			if(n.getRight() != null) {
				printPostOrder(n.getRight());
			}
			System.out.print(n.getKey() + " ");		
		}		
}

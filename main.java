public class main {
	public static void main(String [] args) {
		BSTree T = new BSTree();

		// inserções
		T.insert(9);
		T.insert(3);
		T.insert(12);
		T.insert(2);
		T.insert(4);
		T.insert(17);
		T.insert(21);
		T.insert(13);
		T.insert(11);

		// teste de visualização
//		System.out.println(T.root.getKey());
//		System.out.println("left " + T.root.getLeft().getKey());
//		System.out.println("right " + T.root.getRight().getKey());

		System.out.println("implementação do método de busca\n");
		int x = 12;
		Node n = T.search(x);
		System.out.println("busca " + n.getKey());
		System.out.println("left " + n.getLeft().getKey());
		System.out.println("right " + n.getRight().getKey());

	}
}

public class main {
	public static void main(String [] args) {
		BSTree T = new BSTree();

		// inserções
//		T.insert(9);
//		T.insert(3);
//		T.insert(12);
//		T.insert(2);
//		T.insert(4);
//		T.insert(17);
//		T.insert(21);
//		T.insert(13);
//		T.insert(11);

//		T.insert(20);
//		T.insert(12);
//		T.insert(10);
//		T.insert(7);
//		T.insert(17);
//		T.insert(16);
//		T.insert(50);

		T.insert(6);
		T.insert(2);
		T.insert(7);
		T.insert(1);
		T.insert(4);
		T.insert(3);
		T.insert(5);
		T.insert(9);
		T.insert(8);

		

		// teste de visualização
//		System.out.println(T.root.getKey());Binary search algorithm

//		System.out.println("left " + T.root.getLeft().getKey());
//		System.out.println("right " + T.root.getRight().getKey());

//		T.deleteMerge(6);
//		System.out.println("implementação do método de busca\n");
		int x = 6;
		Node n = T.search(x);
//		System.out.println("  " + n.getKey());
//		System.out.print(n.getLeft().getKey());
//		System.out.println("  " + n.getRight().getKey() + "\n");

		System.out.println("Teste de impressão Pre-Order\n");
		T.printPreOrder(n);
		System.out.println();

		System.out.println("Teste de impressão In-Order\n");
		T.printInOrder(n);
		System.out.println();

		System.out.println("Teste de impressão Post-Order\n");
		T.printPostOrder(n);
		System.out.println();

		T.deleteMerge(4);

		T.printPreOrder(n);
		System.out.println();

		T.printInOrder(n);
		System.out.println();

		T.printPostOrder(n);
		System.out.println();
	}
}

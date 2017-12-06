
public class Client {

	public static void main(String[] args) {
		
		BinTreeComposite t1 = new BinTreeComposite();
		t1.setData('a');
		BinTreeComposite t21 = new BinTreeComposite();
		t21.setData('b');
		BinTreeComposite t22 = new BinTreeComposite();
		t22.setData('c');
		t1.setLeft(t21);
		t1.setRight(t22);
		
		
		BinTreeComposite t31 = new BinTreeComposite();
		t31.setData('d');
		BinTreeLeaf t32 = new BinTreeLeaf();
		t32.setData('e');
		
		t21.setLeft(t31);
		t21.setRight(t32);

		
		BinTreeLeaf t33 = new BinTreeLeaf();
		t33.setData('f');
		BinTreeComposite t34 = new BinTreeComposite();
		t34.setData('g');
		t22.setLeft(t33);
		t22.setRight(t34);
		
		
		
		BinTreeLeaf t41 = new BinTreeLeaf();
		t41.setData('h');
		BinTreeLeaf t42 = new BinTreeLeaf();
		t42.setData('i');
		
		t31.setLeft(t41);
		t34.setRight(t42);
		
		System.out.print("先序遍历：");
		t1.preTraverse();
		System.out.println();
		
		System.out.print("中序遍历：");
		t1.inOrderTraverse();
		System.out.println();
		
		System.out.print("后序遍历：");
		t1.postTraverse();
		System.out.println();
	}
	
}

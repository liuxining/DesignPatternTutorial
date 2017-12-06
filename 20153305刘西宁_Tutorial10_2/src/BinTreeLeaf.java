
public class BinTreeLeaf extends BinTreeComponent {

	@Override
	public void preTraverse() {
		System.out.print(data);
	}

	@Override
	public void inOrderTraverse() {
		System.out.print(data);
	}

	@Override
	public void postTraverse() {
		System.out.println(data);
	}

}


public class BinTreeComposite extends BinTreeComponent {

	private BinTreeComponent left;
	private BinTreeComponent right;

	public BinTreeComponent getLeft() {
		return left;
	}

	public void setLeft(BinTreeComponent left) {
		this.left = left;
	}

	public BinTreeComponent getRight() {
		return right;
	}

	public void setRight(BinTreeComponent right) {
		this.right = right;
	}

	// 先序遍历
	@Override
	public void preTraverse() {
		System.out.print(data);
		if (left != null) {
			left.preTraverse();
		}
		if (right != null) {
			right.preTraverse();
		}
	}

	@Override
	// 中序遍历
	public void inOrderTraverse() {
		if (left != null) {
			left.preTraverse();
		}
		System.out.print(data);
		if (right != null) {
			right.preTraverse();
		}
	}

	@Override
	// 后序遍历
	public void postTraverse() {
		if (left != null) {
			left.preTraverse();
		}
		if (right != null) {
			right.preTraverse();
		}
		System.out.print(data);
	}
}

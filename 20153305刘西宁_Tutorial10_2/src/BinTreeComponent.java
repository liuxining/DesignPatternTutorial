
public abstract class BinTreeComponent {
	char data;

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}
	
	public abstract void preTraverse();
	public abstract void inOrderTraverse();
	public abstract void postTraverse();
	
}

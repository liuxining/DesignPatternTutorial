
public abstract class FileComponent {

	String name;

	abstract void add(FileComponent c);

	abstract void remove(FileComponent c);

	abstract FileComponent getChild(int i);

	abstract void operator(int t);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

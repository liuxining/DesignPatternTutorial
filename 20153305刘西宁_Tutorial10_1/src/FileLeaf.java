
public class FileLeaf extends FileComponent {

	@Override
	void add(FileComponent c) {
		throw new RuntimeException();
	}

	@Override
	void remove(FileComponent c) {
		throw new RuntimeException();
	}

	@Override
	FileComponent getChild(int i) {
		throw new RuntimeException();
	}

	@Override
	void operator(int t) {
		for (int i = 0; i < t; i++) {
			System.out.print("\t");
		}
		System.out.println("打开文件 " + name);
	}

}

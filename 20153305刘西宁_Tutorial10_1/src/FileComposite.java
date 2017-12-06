import java.util.ArrayList;
import java.util.List;

public class FileComposite extends FileComponent {

	List<FileComponent> list = new ArrayList<FileComponent>();
	
	@Override
	void add(FileComponent c) {
		list.add(c);
	}

	@Override
	void remove(FileComponent c) {
		list.remove(c);
	}

	@Override
	FileComponent getChild(int i) {
		if(i > list.size() || i <= 0){
			return null;
		}
		return list.get(i - 1);
	}

	@Override
	void operator(int t) {
		for (int i = 0; i < t; i++) {
			System.out.print("\t");
		}
		System.out.println("打开文件夹 " + name + " ：");
		for (FileComponent fileComponent : list) {
			if(fileComponent != null){
				fileComponent.operator(t + 1);
			}
		}
	}

}

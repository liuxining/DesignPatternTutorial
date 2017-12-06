import java.io.File;

public class Client {
	public static void main(String[] args) {
		File file = new File("/Users/liuxining/Documents/workplace/java_dp/20153305刘西宁_Tutorial10_1");
		
		FileComponent fc = getFile(file);
		if(fc != null){
			fc.operator(0);
			
		}
		
	}

	private static FileComponent getFile(File file) {
		if(!file.exists()){
			return null;
		}
		FileComponent fc = null;
		if(file.isDirectory()){
			fc = new FileComposite();
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				fc.add(getFile(file2));
			}
		}
		else{
			fc = new FileLeaf();
		}
		fc.setName(file.getName());
		return fc;
	}
}

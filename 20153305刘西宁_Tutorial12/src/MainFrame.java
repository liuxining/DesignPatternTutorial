
public class MainFrame {
	private Memory memory = new Memory();
	private CPU cpu = new CPU();
	private HardDisk hardDisk = new HardDisk();
	private OS os = new OS();
	
	public void on() {
		System.out.println("计算机启动");
		memory.check();
		cpu.run();
		hardDisk.read();
		os.load();
		System.out.println("计算机启动完成");
	}
	
	
	
}

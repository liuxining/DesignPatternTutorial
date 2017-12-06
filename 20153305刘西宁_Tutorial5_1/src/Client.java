
public class Client {
	public static void main(String[] args) {
		Director dir = new Director();
		dir.setComputerBuilder((ComputerBuilder) XMLUtil.getBean());
		Computer c = dir.construct();
		System.out.println("生产的电脑为：" + c);
	}
}

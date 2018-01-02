package client;

import memento.CareTaker;
import memento.UserInfoDTO;

public class Client {
	public static void main(String[] args) {
		UserInfoDTO user = new UserInfoDTO();
		CareTaker c = new CareTaker();

		user.setAccount("张三");
		user.setPassword("123456");
		user.setTelNo("1001");

		System.out.println("状态一：");
		user.show();
		System.out.println();
		c.addMemento(user.saveMemento());
		
		user.setPassword("abcdef");
		user.setTelNo("1002");
		System.out.println("状态二：");
		user.show();
		System.out.println();
		c.addMemento(user.saveMemento());
		
		user.setPassword("qwertyuiop");
		user.setTelNo("1003");
		System.out.println("状态三：");
		user.show();
		System.out.println();
		
		System.out.println("回到状态二：");
		user.restoreMemento(c.getMemento());
		user.show();
		System.out.println();
		System.out.println("回到状态一：");
		user.restoreMemento(c.getMemento());
		user.show();
		System.out.println();
	}
}

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		People p = Factory.factoryMathod(XMLUtil.getBean("paramMsg"));
		p.show();
	}
}

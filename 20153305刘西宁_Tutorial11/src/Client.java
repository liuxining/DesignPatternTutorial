
public class Client {
	public static void main(String[] args) {
		Phone p1, p2, p3;

		p1 = new SimplePhone();
		System.out.println("SimplePhone:");
		p1.cell();
		System.out.println("提示来电\n");

		System.out.println("JarPhone:");
		p2 = new JarPhone(p1);
		p2.cell();
		System.out.println("提示来电\n");

		System.out.println("ComplexPhone:");
		p3 = new ComplexPhone(p2);
		p3.cell();
		System.out.println("提示来电\n");

	}
}

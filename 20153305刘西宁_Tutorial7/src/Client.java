
public class Client {
	public static void main(String[] args) {
		XueHao x1 = XueHao.getInstance();
		XueHao x2 = XueHao.getInstance();
		System.out.println("x1 == x2  :  " + (x1 == x2));
		System.out.println("x1 equals x2  :  " + (x1.equals(x2)));
		System.out.println("x1.no == x2.no  :  " + (x1.getNo() == x2.getNo()));
		System.out.println("x1.no equals x2.no  :  " + (x1.getNo().equals(x2.getNo())));
	}
}

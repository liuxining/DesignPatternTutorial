
public class Client {
	public static void main(String[] args) {
		Color color;
		Pen pen;
		
		color = (Color) XMLUtil.getBean("color");
		pen = (Pen) XMLUtil.getBean("pen");
		
		pen.setColor(color);
		pen.draw("鲜花");
	}
}

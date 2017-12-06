
public class XueHao {
	private static XueHao instance;
	private String no;

	private XueHao() {

	}

	public static XueHao getInstance() {
		if (instance == null) {
			instance = new XueHao();
			instance.setNo("20153305");
		}
		return instance;
	}

	public String getNo() {
		return no;
	}

	private void setNo(String no) {
		this.no = no;
	}

}

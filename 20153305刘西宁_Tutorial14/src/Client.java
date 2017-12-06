
public class Client {
	public static void main(String[] args) {
		HunJieSuoProxy hunJieSuoProxy = (HunJieSuoProxy) XMLUtil.getBean();
		hunJieSuoProxy.setAge(17);
		hunJieSuoProxy.findObj();
	}
}

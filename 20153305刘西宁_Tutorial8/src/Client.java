
public class Client {
	public static void main(String[] args) {
		ICat cat = new TwoAdapter(new Dog());
		cat.catTalk();
		cat.zhuo();
		
		IDog dog = new TwoAdapter(new Cat());
		dog.dogTalk();
		dog.dark();
	}
}

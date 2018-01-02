
public class Client {

	public static void main(String[] args) {
		MySubject subject = new Stock();
		
		MyObserver obs1,obs2,obs3;
		obs1 = new StockMen();
		obs2 = new StockMen();
		obs3 = new StockMen();
		
		subject.attach(obs1);
		subject.attach(obs2);
		subject.attach(obs3);
		
		
		subject.notify("上涨");
		System.out.println();
		subject.notify("下降");
		
		
		
	}
	
}

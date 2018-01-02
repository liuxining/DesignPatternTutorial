
public class Stock extends MySubject {

	@Override
	public void notify(String args) {
		System.out.println("股票价格：" + args);
		System.out.println("-------------------------");
		for (MyObserver myObserver : observers) {
			myObserver.response(args);
		}
		
	}

}

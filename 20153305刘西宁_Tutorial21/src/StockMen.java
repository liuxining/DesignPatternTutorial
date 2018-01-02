
public class StockMen implements MyObserver {

	@Override
	public void response(String args) {
		if(args.equals("上涨")){
			System.out.println("股民买股票");
		}
		else{
			System.out.println("股民大哭一场");
		}
		
	}

}


public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Order order) {
		if(order.getMoney() <= 10000){
			System.out.println("主任" + name + "审批采购单" + order.getId() + "，采购单金额为:" + order.getMoney());
		}
		else{
			this.successor.handleRequest(order);
		}
		
	}

}

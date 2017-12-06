
public class ViceManager extends Leader {

	public ViceManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Order order) {
		if(order.getMoney() <= 100000){
			System.out.println("副总经理" + name + "审批采购单" + order.getId() + "，采购单金额为:" + order.getMoney());
		}
		else{
			this.successor.handleRequest(order);
		}
		
	}

}

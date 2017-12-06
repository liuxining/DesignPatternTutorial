
public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Order order) {
		if(order.getMoney() <= 200000){
			System.out.println("总经理" + name + "审批采购单" + order.getId() + "，采购单金额为:" + order.getMoney());
		}
		else{
			System.out.println("采购单:" + order.getId() + ",金额：" + order.getMoney() + ",超过20万元，需要开职工大会决定");
		}
	}

}

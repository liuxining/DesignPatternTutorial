
public class DepartmentManager extends Leader {

	public DepartmentManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Order order) {
		if(order.getMoney() <= 50000){
			System.out.println("部门经理" + name + "审批采购单" + order.getId() + "，采购单金额为:" + order.getMoney());
		}
		else{
			this.successor.handleRequest(order);
		}
		
	}

}

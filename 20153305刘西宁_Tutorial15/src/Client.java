
public class Client {
	public static void main(String[] args) {
		Leader director, departmentManager, viceManager, manager;
		director = new Director("张三");
		departmentManager = new DepartmentManager("李四");
		viceManager = new ViceManager("王五");
		manager = new Manager("赵六");

		director.setSuccessor(departmentManager);
		departmentManager.setSuccessor(viceManager);
		viceManager.setSuccessor(manager);

		Order o1 = new Order("1001", 5000);
		director.handleRequest(o1);
		Order o2 = new Order("1002", 30000);
		director.handleRequest(o2);
		Order o3 = new Order("1003", 80000);
		director.handleRequest(o3);
		Order o4 = new Order("1004", 140000);
		director.handleRequest(o4);
		Order o5 = new Order("1005", 240000);
		director.handleRequest(o5);
	}
}

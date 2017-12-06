package cxgc;

public class Client {
	public static void main(String[] args) {
		PFactory factory = (PFactory) XMLUtil.getBean("Factory");
		Man man = factory.productMan();
		man.show();
		Woman woman = factory.productWoman();
		woman.show();
	}
}
